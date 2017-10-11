package com.ucl.common;

import java.io.Serializable;

/**
 * Created by jiang.zheng on 2017/9/18.
 */
public class BasePagination implements Serializable {

    private static final long serialVersionUID = -1L;

    /** 非操作变量 **/

    protected Integer startRow;

    protected Integer nextPage;          //下一页

    protected Integer prePage;           //上一页
}
