package com.spb.wally.reflect;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/25 16:39
 * @version: v1.0
 */
public class ClinitTest1 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }


    public static void main(String[] args) {
        //首先加载Father类，其次加载Son类
        System.out.println(Son.B);
    }
}
