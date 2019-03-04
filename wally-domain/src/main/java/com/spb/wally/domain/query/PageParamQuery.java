package com.spb.wally.domain.query;

import lombok.Data;

/**
 * @description 分页查询父类
 * @author: gaobh
 * @date: 2019/2/15 10:30
 * @version: v1.0
 */
@Data
public class PageParamQuery {
    /**
     * 起始页码
     */
    private Integer offset;
    /**
     * 页面大小
     */
    private Integer pageSize;
}
