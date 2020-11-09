package com.spb.wally.jvm.chapter13;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/28 17:56
 * @version: v1.0
 */
public class MyClass  {
    private static int staticInt = 0;

    static {
        staticInt = 1;
    }

    {
        staticInt = 2;
    }

    public MyClass() {
        staticInt = 3;
    }

    private static int getStaticInt() {
        return staticInt;
    }

    public int getInstanceInt() {
        return getStaticInt();
    }

    public static void main(String[] args){
        System.out.println(getStaticInt());
    }
}

