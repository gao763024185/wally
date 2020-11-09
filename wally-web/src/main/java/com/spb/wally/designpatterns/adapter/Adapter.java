package com.spb.wally.designpatterns.adapter;


/**
 * @description 真正的适配器USB 连接网线
 * 通过继承的方式
 * @author: gaobh
 * @date: 2020/9/10 13:53
 * @version: v1.0
 */
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        super.request();
    }
}
