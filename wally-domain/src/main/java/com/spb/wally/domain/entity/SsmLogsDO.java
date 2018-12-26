package com.spb.wally.domain.entity;

import lombok.Data;

import java.util.Date;


/**
 * @description 日志文章实体类
 * @author: gaobh
 * @date: 2018/12/26 9:24
 * @version: v1.0
 */
@Data
public class SsmLogsDO {
    /**
     * <pre>
     *
     * 表字段 : ssm_logs.id
     * </pre>
     */
    private String id;

    /**
     * <pre>
     * 日志标题
     * 表字段 : ssm_logs.log_title
     * </pre>
     */
    private String logTitle;

    /**
     * <pre>
     * 摘要
     * 表字段 : ssm_logs.log_summary
     * </pre>
     */
    private String logSummary;

    /**
     * <pre>
     * 内容
     * 表字段 : ssm_logs.log_content
     * </pre>
     */
    private String logContent;

    /**
     * <pre>
     * 访问次数
     * 表字段 : ssm_logs.read_count
     * </pre>
     */
    private Integer readCount;

    /**
     * <pre>
     * 创建人
     * 表字段 : ssm_logs.creator
     * </pre>
     */
    private Integer creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : ssm_logs.gmt_create
     * </pre>
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 修改人
     * 表字段 : ssm_logs.modifier
     * </pre>
     */
    private Integer modifier;

    /**
     * <pre>
     * 修改时间
     * 表字段 : ssm_logs.gmt_modified
     * </pre>
     */
    private Date gmtModified;

    /**
     * <pre>
     * 是否删除{0:未删除,1:删除}
     * 表字段 : ssm_logs.is_deleted
     * </pre>
     */
    private Integer isDeleted;
}