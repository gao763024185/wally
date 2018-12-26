package com.spb.wally.controller.user;

import com.spb.wally.service.UserInfoService;
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
public class AdminController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    public String loginVal() {
        return userInfoService.print();
    }


}
