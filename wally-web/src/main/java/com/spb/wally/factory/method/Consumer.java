package com.spb.wally.factory.method;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:11
 * @version: v1.0
 */
public class Consumer {
    public static void main(String[] args){
        Car car = new WuLingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();

        car.name();
        car1.name();
    }
}
