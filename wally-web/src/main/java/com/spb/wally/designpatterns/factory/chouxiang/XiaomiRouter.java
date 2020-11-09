package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:07
 * @version: v1.0
 */
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("开启小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("开启小米wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米路由器密码");

    }
}
