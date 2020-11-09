package com.spb.wally.designpatterns.adapter;

import java.awt.*;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 13:50
 * @version: v1.0
 */
public class Computer {
    /**
     * 电脑需要连接转接器
     * @param netToUsb
     */
    public void net(NetToUsb netToUsb){
        //上网的具体实现：找一个转接头
        netToUsb.handleRequest();
    }

    public static void main(String[] args){
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter2 adapter = new Adapter2(adaptee);
        computer.net(adapter);
    }
}
