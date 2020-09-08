package com.spb.wally.single;

/**
 * @description 饿汉式单例模式
 *                  缺点 ： 浪费空间
 * @author: gaobh
 * @date: 2020/9/3 16:04
 * @version: v1.0
 */
public class Hungry {
    private Hungry(){

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
