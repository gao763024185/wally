package com.spb.wally.designpatterns.adapter;


/**
 * @description 真正的适配器USB 连接网线
 *  通过组合的方式
 * @author: gaobh
 * @date: 2020/9/10 13:53
 * @version: v1.0
 */
public class Adapter2 implements NetToUsb {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
