package com.spb.wally.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class LogsDO {
    /**
     * <pre>
     * 
     * 表字段 : wa_logs.id
     * </pre>
     * 
     */
    private String id;

    /**
     * <pre>
     * 日志标题
     * 表字段 : wa_logs.log_title
     * </pre>
     * 
     */
    private String logTitle;

    /**
     * <pre>
     * 摘要
     * 表字段 : wa_logs.log_summary
     * </pre>
     * 
     */
    private String logSummary;

    /**
     * <pre>
     * 内容
     * 表字段 : wa_logs.log_content
     * </pre>
     * 
     */
    private String logContent;

    /**
     * <pre>
     * 访问次数
     * 表字段 : wa_logs.count
     * </pre>
     * 
     */
    private Integer count;

    /**
     * <pre>
     * 创建人
     * 表字段 : wa_logs.creator
     * </pre>
     * 
     */
    private Integer creator;

    /**
     * <pre>
     * 创建时间
     * 表字段 : wa_logs.gmt_create
     * </pre>
     * 
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 修改人
     * 表字段 : wa_logs.modifier
     * </pre>
     * 
     */
    private Integer modifier;

    /**
     * <pre>
     * 修改时间
     * 表字段 : wa_logs.gmt_modified
     * </pre>
     * 
     */
    private Date gmtModified;

    /**
     * <pre>
     * 是否删除{0:未删除,1:删除}
     * 表字段 : wa_logs.is_deleted
     * </pre>
     * 
     */
    private Integer isDeleted;
}