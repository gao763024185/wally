package com.spb.wally.utils;

import lombok.Data;

import java.util.List;

/**
 * Created by gaobh on 2016/12/29.
 */
@Data
public class Pager<T> {
    private int pageSize = 5;

    private int currentPage;

    private int totalRecord;

    private int totalPage;

    private List<T> dataList;

    /**
     * 采用list的sublist实现分页
     *
     * @param pageNum
     * @param pageSize
     * @param sourceList
     */
    public Pager(int pageNum, int pageSize, List<T> sourceList) {
        if (sourceList == null) {
            return;
        }
        this.totalRecord = sourceList.size();
        this.pageSize = pageSize;
        this.totalPage = totalRecord / pageSize;
        if (totalRecord < pageSize || totalRecord % pageSize != 0) {
            this.totalPage = this.totalPage + 1;
        }
        this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;
        int fromIndex = this.pageSize * (this.currentPage - 1);
        int toIndex = this.pageSize * this.currentPage > this.totalRecord ? this.totalRecord : this.pageSize * this.currentPage;
        this.dataList = sourceList.subList(fromIndex, toIndex);
    }

    public Pager() {
    }


    public Pager(int pageSize, int currentPage, int totalRecord, int totalPage, List<T> dataList) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.dataList = dataList;
    }


    public Pager(int pageNum, int pageSize, int totalRecord, List<T> dataList) {
        if (totalRecord == 0) {
            return;
        }
        if (CollectionUtil.isEmpty(dataList)) {
            return;
        }
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        this.totalPage = totalRecord / pageSize;
        if (totalRecord < pageSize || totalRecord % pageSize != 0) {
            this.totalPage = this.totalPage + 1;
        }
        this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;
        int fromIndex = this.pageSize * (this.currentPage - 1);
        int toIndex = this.pageSize * this.currentPage > this.totalRecord ? this.totalRecord : this.pageSize * this.currentPage;
        this.dataList = dataList;
    }
}
