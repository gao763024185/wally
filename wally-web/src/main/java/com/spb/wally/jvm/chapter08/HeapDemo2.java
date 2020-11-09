package com.spb.wally.jvm.chapter08;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/19 11:21
 * @version: v1.0
 */
public class HeapDemo2 {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end....");
    }
}
