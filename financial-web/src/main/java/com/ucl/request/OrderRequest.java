package com.ucl.request;

import com.ucl.common.Pagination;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by jiang.zheng on 2017/9/18.
 */
public class OrderRequest extends Pagination {

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
