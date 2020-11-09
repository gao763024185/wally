package com.spb.wally.designpatterns.staticagent.demo2;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:29
 * @version: v1.0
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void query() {
        userService.query();
    }

    public void log(String msg) {
        System.out.println("试用了" + msg + "方法");
    }
}
