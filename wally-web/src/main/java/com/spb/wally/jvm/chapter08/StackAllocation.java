package com.spb.wally.jvm.chapter08;

/**
 * @description 栈上分配
 * @author: gaobh
 * @date: 2020/10/20 17:12
 * @version: v1.0
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }

        long end = System.currentTimeMillis();

        System.out.println("花费时间为："+(end-start)+" ms");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    private static void alloc(){
        User user = new User();
    }
    static class User{

    }
}
