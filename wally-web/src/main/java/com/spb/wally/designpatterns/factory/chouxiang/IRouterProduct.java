package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 16:34
 * @version: v1.0
 */
public interface IRouterProduct {
    void start();
    void shutdown();
    void openWifi();
    void setting();
}
