package com.spb.wally.controller.vo;

import lombok.Data;

/**
 * @description 分页vo
 * @author: gaobh
 * @date: 2019/2/15 14:34
 * @version: v1.0
 */
@Data
public class PageVO {
    /**
     *
     */
    private Integer pageNum;
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总记录条数
     */
    private Integer totalRecord;
}
