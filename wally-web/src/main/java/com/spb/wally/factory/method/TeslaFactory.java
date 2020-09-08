package com.spb.wally.factory.method;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:22
 * @version: v1.0
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
