package com.spb.wally.designpatterns.staticagent.demo2;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:32
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.query();
    }
}
