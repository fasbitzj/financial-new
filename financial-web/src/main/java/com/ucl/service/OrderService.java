package com.ucl.service;

import com.ucl.common.Page;
import com.ucl.model.Order;
import com.ucl.request.OrderRequest;

/**
 * Created by jiang.zheng on 2017/9/14.
 */
public interface OrderService {

    Order findBySerialNumber(String serialNumber);

    Order findBySerialNumberFromMaster(String serialNumber);

    Page<Order> findPage(OrderRequest request);

    Page<Order> findPage(OrderRequest request, int totalCount);

    int findCount(OrderRequest request);
}
