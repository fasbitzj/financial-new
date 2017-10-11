package com.ucl.dao.master;

import com.ucl.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jiang.zheng on 2017/9/14.
 */
@Mapper
public interface MasterOrderDao {

    Order findBySerialNumber(@Param("serialNumber") String serialNumber);
}
