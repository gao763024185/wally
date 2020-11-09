package com.spb.wally.designpatterns.staticagent.demo1;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:21
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args){
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
