package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:05
 * @version: v1.0
 */
public class XiaomiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米发消息");
    }
}
