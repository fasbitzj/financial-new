package com.ucl.service.impl;

import com.ucl.common.Page;
import com.ucl.dao.cluster.OrderDao;
import com.ucl.dao.master.MasterOrderDao;
import com.ucl.model.Order;
import com.ucl.request.OrderRequest;
import com.ucl.service.OrderService;
import com.ucl.utils.ObjectUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by jiang.zheng on 2017/9/14.
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger logger = LogManager.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MasterOrderDao masterOrderDao;

    @Override
    public Order findBySerialNumber(String serialNumber) {
        return orderDao.findBySerialNumber(serialNumber);
    }

    @Override
    public Order findBySerialNumberFromMaster(String serialNumber) {
        return masterOrderDao.findBySerialNumber(serialNumber);
    }

    @Override
    public Page<Order> findPage(OrderRequest request) {
        try {
            Map<String, Object> param = ObjectUtil.objectToMap(request);
            Integer total = orderDao.findCount(param);
            if (null == total) {
                total = 0;
            }
            List<Order> list = orderDao.find(param);
            return new Page<>(total, list, request.getPagination());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return new Page<>();
    }

    @Override
    public Page<Order> findPage(OrderRequest request, int totalCount) {
        try {
            Map<String, Object> param = ObjectUtil.objectToMap(request);
            List<Order> list = orderDao.find(param);
            return new Page<>(totalCount, list, request.getPagination());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return new Page<>();
    }

    public int findCount(OrderRequest request) {
        Map<String, Object> param = ObjectUtil.objectToMap(request);
        Integer total = orderDao.findCount(param);
        if (null == total) {
            return 0;
        }
        return total;
    }
}
