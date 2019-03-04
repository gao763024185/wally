package com.spb.wally.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class BaseUserDO {
    /**
     * <pre>
     * 
     * 表字段 : wa_base_user.id
     * </pre>
     * 
     */
    private Integer id;

    /**
     * <pre>
     * 用户名称
     * 表字段 : wa_base_user.user_name
     * </pre>
     * 
     */
    private String userName;

    /**
     * <pre>
     * 密码
     * 表字段 : wa_base_user.password
     * </pre>
     * 
     */
    private String password;

    /**
     * <pre>
     * 登陆时间
     * 表字段 : wa_base_user.login_time
     * </pre>
     * 
     */
    private Date loginTime;

    /**
     * <pre>
     * 头像地址
     * 表字段 : wa_base_user.user_avatar
     * </pre>
     * 
     */
    private String userAvatar;

    /**
     * <pre>
     * 头像缩略图
     * 表字段 : wa_base_user.avatar_thumbnail
     * </pre>
     * 
     */
    private String avatarThumbnail;

    /**
     * <pre>
     * 创建人
     * 表字段 : wa_base_user.creator
     * </pre>
     * 
     */
    private Integer creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : wa_base_user.gmt_create
     * </pre>
     * 
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 修改人
     * 表字段 : wa_base_user.modifier
     * </pre>
     * 
     */
    private Integer modifier;

    /**
     * <pre>
     * 修改时间
     * 表字段 : wa_base_user.gmt_modified
     * </pre>
     * 
     */
    private Date gmtModified;

    /**
     * <pre>
     * 是否删除{0:未删除,1:删除}
     * 表字段 : wa_base_user.is_deleted
     * </pre>
     * 
     */
    private Integer isDeleted;
}