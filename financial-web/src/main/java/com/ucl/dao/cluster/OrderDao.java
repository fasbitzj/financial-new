package com.ucl.dao.cluster;

import com.ucl.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by jiang.zheng on 2017/9/14.
 */
@Mapper
public interface OrderDao {

    Order findBySerialNumber(@Param("serialNumber") String serialNumber);

    List<Order> find(Map<String, Object> params);

    Integer findCount(Map<String, Object> params);
}
