package com.ucl.common;

/**
 * Created by jiang.zheng on 2017/9/18.
 */
public class Pagination extends BasePagination {

    public static final Integer MAX_PAGE_SIZE = 5000;

    private Integer pageIndex = 1;  // 当前页

    private Integer pageSize = 20;   // 页大小

    public Pagination() {
    }

    public Pagination(Integer pageIndex, Integer pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        setStartRow();
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartRow() {
        if (null == startRow) {
            setStartRow();
        }
        return startRow;
    }

    private void setStartRow() {
        startRow = (pageIndex - 1) * pageSize + 1;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    //设置下一页
    public void nextPage() {
        this.nextPage = this.pageIndex+1;
        setPageIndex(nextPage);
    }

    public Integer getPrePage() {
        return prePage;
    }

    //设置上一页
    public void setPrePage() {
        this.prePage =this.pageIndex-1;
        if(this.prePage<1){
            this.prePage=1;
        }
    }

    public Pagination getPagination() {
        return new Pagination(pageIndex, pageSize);
    }
}
