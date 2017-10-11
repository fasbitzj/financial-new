package com.ucl.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang.zheng on 2017/9/15.
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -1L;

//    private int pageSize = 20;            //页大小
//    private int pageIndex = 1;           //当前页号
    private int totalPageCount = 0;      //总页数
    private int totalCount = 0;              //记录总数
    private List<T>  content = new ArrayList<T>();     //数据内容

    private final Pagination pagination;

    public Page() {
        this.totalCount = 0;
        this.pagination = new Pagination();
    }

    public Page(int totalCount, List<T> content, Pagination pagination) {
        this.totalCount = totalCount;
        this.content.addAll(content);
        this.pagination = pagination;
    }

    public int getPageSize() {
        return pagination.getPageSize();
    }

    public int getPageIndex() {
        return pagination.getPageIndex();
    }

    public int getTotalPageCount() {
        setTotalPageCount();
        return totalPageCount;
    }

    //总页数
    public void setTotalPageCount() {
        int totalPage = totalCount % getPageSize() == 0 ? totalCount / getPageSize() : totalCount / getPageSize() + 1;
        this.totalPageCount = totalPage;
    }

    public List<T> getContent() {
        return content;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Pagination getPagination() {
        return pagination;
    }

}
