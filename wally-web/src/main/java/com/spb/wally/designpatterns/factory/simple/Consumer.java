package com.spb.wally.designpatterns.factory.simple;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:11
 * @version: v1.0
 */
public class Consumer {
    public static void main(String[] args){
//        Car car = new WuLing();
//        Car car1 = new Tesla();

        //使用工厂创建
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}
