package com.spb.wally.designpatterns.adapter;

/**
 * @description 要被适配的类 网线
 * @author: gaobh
 * @date: 2020/9/10 13:50
 * @version: v1.0
 */
public class Adaptee {
    public void request(){
        System.out.println("可以上网了");
    }
}
