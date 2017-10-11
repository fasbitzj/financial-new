package com.ucl.api.controller;

import com.ucl.common.Page;
import com.ucl.model.Order;
import com.ucl.request.OrderRequest;
import com.ucl.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang.zheng on 2017/9/14.
 */
@RequestMapping(value = "/api")
@RestController
public class OrderController {
    private static final Logger logger = LogManager.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "order")
    public Object findBySerialNumber(String serialNumber) {
        logger.debug("serialNumber : " + serialNumber);
        return orderService.findBySerialNumber(serialNumber);
    }

    @RequestMapping(value = "orderMaster")
    public Object findBySerialNumberFromMaster(String serialNumber) {
        logger.debug("serialNumber : " + serialNumber);
        return orderService.findBySerialNumberFromMaster(serialNumber);
    }


    @RequestMapping(value = "orderPage")
    public Object findPage(OrderRequest request) {
        logger.debug("request : " + request);
        Page<Order> page = orderService.findPage(request);
        return page.getContent();
    }
}
