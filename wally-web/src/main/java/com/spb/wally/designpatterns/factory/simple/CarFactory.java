package com.spb.wally.designpatterns.factory.simple;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/7 15:12
 * @version: v1.0
 */
public class CarFactory {

    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing();
        } else if (car.equals("特斯拉")) {
            return new Tesla();
        } else {
            return null;
        }
    }
}
