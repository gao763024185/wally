package com.spb.wally.designpatterns.bridge;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 15:30
 * @version: v1.0
 */
public class Test {
    public static void main(String[] args){
        //苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();
        //联想台式机
        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();
    }
}
