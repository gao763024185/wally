package com.spb.wally.controller.user;

import com.spb.wally.config.AdminProperties;
import com.spb.wally.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description 后台controller
 * @author: gaobh
 * @date: 2018/12/27
 * @version: v1.0
 */
@RestController
@RequestMapping("/admin")
@Slf4j
@ConfigurationProperties(prefix = "admin")
public class AdminController {

    @Resource
    private UserInfoService userInfoService;
    @Resource
    private AdminProperties adminProperties;
    String view_base = "/admin/";

}
