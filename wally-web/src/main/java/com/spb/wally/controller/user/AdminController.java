package com.spb.wally.controller.user;

import com.spb.wally.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description 后台controller
 * @author: gaobh
 * @date: 2016/12/16
 * @version: v1.0
 */
@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public String loginVal() {
        log.info("我是info");
        log.warn("我是warn");
        log.error("我是error");
        return userInfoService.print();
    }
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
