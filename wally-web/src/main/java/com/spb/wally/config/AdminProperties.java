package com.spb.wally.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description 获取后台相关配置数据
 * @author: gaobh
 * @date: 2018/12/26 16:03
 * @version: v1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "admin")
public class AdminProperties {

    private String userId;
}
