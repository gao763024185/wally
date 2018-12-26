package com.spb.wally.domain.entity;

import lombok.Data;

import java.util.Date;


/**
 * @description 目录实体类
 * @author: gaobh
 * @date: 2018/12/26 9:24
 * @version: v1.0
 */
@Data
public class BaseMenuDO {
    /**
     * <pre>
     *
     * 表字段 : base_menu.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 当前目录的父id
     * 表字段 : base_menu.p_menu_id
     * </pre>
     */
    private Integer pMenuId;

    /**
     * <pre>
     * 目录名称
     * 表字段 : base_menu.menu_name
     * </pre>
     */
    private String menuName;

    /**
     * <pre>
     * 目录链接地址
     * 表字段 : base_menu.menu_url
     * </pre>
     */
    private String menuUrl;

    /**
     * <pre>
     * 显示类别0、用户1、管理员2、常规
     * 表字段 : base_menu.menu_type
     * </pre>
     */
    private String menuType;

    /**
     * <pre>
     * 创建人
     * 表字段 : base_menu.creator
     * </pre>
     */
    private Integer creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : base_menu.gmt_create
     * </pre>
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 修改人
     * 表字段 : base_menu.modifier
     * </pre>
     */
    private Integer modifier;

    /**
     * <pre>
     * 修改时间
     * 表字段 : base_menu.gmt_modified
     * </pre>
     */
    private Date gmtModified;

    /**
     * <pre>
     * 是否删除{0:未删除,1:删除}
     * 表字段 : base_menu.is_deleted
     * </pre>
     */
    private Integer isDeleted;
}