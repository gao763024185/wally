package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:08
 * @version: v1.0
 */
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("开启华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("开启华为wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置华为路由器密码");

    }
}
