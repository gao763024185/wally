package com.spb.wally.domain.bo;

import lombok.Data;

import java.util.Date;

@Data
public class LogsBO {
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
     * 创建时间
     * 表字段 : wa_logs.gmt_create
     * </pre>
     * 
     */
    private Date gmtCreate;
    /**
     * <pre>
     * 创建时间
     * 表字段 : wa_logs.gmt_create
     * </pre>
     *
     */
    private String gmtCreateStr;

}