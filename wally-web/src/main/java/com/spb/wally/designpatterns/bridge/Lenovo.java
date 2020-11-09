package com.spb.wally.designpatterns.bridge;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 15:25
 * @version: v1.0
 */
public class Lenovo implements Brand {
    @Override
    public void info() {
        System.out.println("联想");
    }
}
