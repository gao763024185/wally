package com.spb.wally.factory.method;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:23
 * @version: v1.0
 */
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
