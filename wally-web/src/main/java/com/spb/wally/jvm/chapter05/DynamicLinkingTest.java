package com.spb.wally.jvm.chapter05;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/15 16:38
 * @version: v1.0
 */
public class DynamicLinkingTest {

    private int num;
    public void methodA(){
        System.out.println("methodA()...");
    }
    public void methodB(){
        System.out.println("methodB()...");

        methodA();

        num++;
    }
}
