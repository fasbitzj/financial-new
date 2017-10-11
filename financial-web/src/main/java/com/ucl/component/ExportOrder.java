package com.ucl.component;

import com.ucl.common.Page;
import com.ucl.field.OrderField;
import com.ucl.model.Order;
import com.ucl.request.OrderRequest;
import com.ucl.service.OrderService;
import com.ucl.utils.ExportUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

/**
 * Created by jiang.zheng on 2017/9/23.
 */
@Component
public class ExportOrder {

    private static final Logger logger = LogManager.getLogger(ExportOrder.class);

    @Autowired
    private OrderService orderService;

    /**
     *
     * @param request
     */
    public void export(OrderRequest request, HttpServletResponse response) {
        int totalPage = 1;
        long timeStamp = System.currentTimeMillis();
        try {
            Page<Order> page = null;
            List<Order> list = null;
            String fileName = URLEncoder.encode("订单导出" + System.currentTimeMillis(), "UTF-8");
            File file = ExportUtil.writeHeader(OrderField.header, fileName);
            int totalCount = orderService.findCount(request);
            long startTime = System.currentTimeMillis();
            do {
                logger.info("totalCount:" + totalCount);
                page = orderService.findPage(request, totalCount);
                logger.info("查询耗时:" + ((System.currentTimeMillis() - startTime)/1000) + "s");
                startTime = System.currentTimeMillis();
                totalPage = page.getTotalPageCount();
                list = page.getContent();
                ExportUtil.writeData(file, list, OrderField.fields);
                logger.info("查询耗时:" + ((System.currentTimeMillis() - startTime)/1000) + "s");
                startTime = System.currentTimeMillis();
                request.nextPage();
            } while (request.getPageIndex()<=totalPage);

            logger.info("总耗时:" + ((System.currentTimeMillis() - timeStamp)/1000) + "s");
            ExportUtil.writeToResponse(response, file, fileName);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);

        }
    }
}
