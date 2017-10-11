package com.ucl.mvc;

import com.ucl.common.Pagination;
import com.ucl.component.ExportOrder;
import com.ucl.request.OrderRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiang.zheng on 2017/9/11.
 */
@Controller
@RequestMapping(value = "templates")
public class TemplatesController {

    private static final Logger logger = LogManager.getLogger(TemplatesController.class);

    @Autowired
    private ExportOrder exportOrder;

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request) {
        request.setAttribute("key", "hello world");
        return "index";
    }

    /**
     * http://localhost:8080/templates/exportOrder?startDate=2017-09-01%2000:00:00&endDate=2017-09-30%2023:59:59
     * @param request
     * @param response
     */
    @RequestMapping(value = "exportOrder")
    public void export(OrderRequest request, HttpServletResponse response) {
        logger.info("export request: " + request);
        request.setPageSize(Pagination.MAX_PAGE_SIZE);
        exportOrder.export(request, response);
    }
}
