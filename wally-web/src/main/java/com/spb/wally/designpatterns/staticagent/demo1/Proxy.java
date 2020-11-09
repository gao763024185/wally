package com.spb.wally.designpatterns.staticagent.demo1;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:21
 * @version: v1.0
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    public void hetong() {
        System.out.println("签合同");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
