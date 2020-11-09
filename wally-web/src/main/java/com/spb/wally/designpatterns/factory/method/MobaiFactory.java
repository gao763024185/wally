package com.spb.wally.designpatterns.factory.method;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 15:38
 * @version: v1.0
 */
public class MobaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
