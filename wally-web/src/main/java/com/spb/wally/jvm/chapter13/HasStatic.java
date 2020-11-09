package com.spb.wally.jvm.chapter13;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/28 11:33
 * @version: v1.0
 */
public class HasStatic {
    private static int x = 100;

    public static void main(String args[]) {
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1 = new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println("x=" + x);
    }
}
