package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:06
 * @version: v1.0
 */
public class HuaWeiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为发消息");
    }
}
