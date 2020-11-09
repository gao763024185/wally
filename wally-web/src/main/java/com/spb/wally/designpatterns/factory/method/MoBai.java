package com.spb.wally.designpatterns.factory.method;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:33
 * @version: v1.0
 */
public class MoBai implements Car {
    @Override
    public void name() {
        System.out.println("摩拜单车");
    }
}
