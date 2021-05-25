package com.sakura.tables.dto;

/**
 * @desc: 分页工具类
 * @auther: Sakura
 * @date:  10:36
 */
public class PageHelperJU {

    private int pageIndex;
    private int pageSize;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
