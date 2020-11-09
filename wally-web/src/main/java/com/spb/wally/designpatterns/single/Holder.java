package com.spb.wally.designpatterns.single;

/**
 * @description 静态内部类
 * @author: gaobh
 * @date: 2020/9/3 16:20
 * @version: v1.0
 */
public class Holder {
    private Holder(){

    }
    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }
    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
