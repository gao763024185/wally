package com.spb.wally.reflect;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/25 10:16
 * @version: v1.0
 */
public class Test05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}

class A {
    static int m = 100;
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }



    public A() {
        System.out.println("A类的无参构造初始化");
    }
}
