package com.spb.wally.jvm.chapter05;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/12 15:02
 * @version: v1.0
 */
public class LocalVariablesTest {
    public static void main(String[] args) {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        int num = 10;
        localVariablesTest.test();
    }

    public void test() {
        int number = 20;
        System.out.println("打印");
    }

    public void test1(){
        int a = 0;
        {
            int b=0;
            b=a+1;
        }
        int c = a+1;
    }
}
