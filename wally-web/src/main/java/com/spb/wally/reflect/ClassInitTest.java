package com.spb.wally.reflect;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/25 16:23
 * @version: v1.0
 */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 200;
    }
    private static int number = 20;
    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
