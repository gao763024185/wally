package com.spb.wally.jvm.chapter13;

import java.util.HashMap;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/26 16:51
 * @version: v1.0
 */
public class StringTest6 {

    /**
     * new String("abc")会创建几个对象？
     * 两个！！！
     * 一个对象是：关键字在堆空间创建的
     * 另一个对象：字符串常量池中的对象 字节码指令：ldc
     * <p>
     * <p>
     * new String("a") + new String("b" )呢？
     * 对象1：new StringBuilder()
     * 对象2：new String("a")
     * 对象3：常量池中的"a"
     * 对象4：new String("b")
     * 对象5：常量池中的"b"
     * <p>
     * <p>
     * 深入剖析：StringBuilder的toString():
     * 对象6：new String("ab");
     * 强调一下，toString()的调用，在字符串常量池中，没有生成“ab”
     *
     * @param args
     */
    public static void main(String[] args) {
//        String str = new String("ab");

//        String string = new String("a") + new String("b");
//        System.out.println(string);
        HashMap hashMap = new HashMap(10);
        Object a = 3;
        System.out.println(a.hashCode());

    }
}

