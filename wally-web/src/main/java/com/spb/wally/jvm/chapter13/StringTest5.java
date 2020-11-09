//package com.spb.wally.jvm.chapter13;
//
//
//import org.junit.jupiter.api.Test;
//
///**
// * @description
// * @author: gaobh
// * @date: 2020/10/26 14:38
// * @version: v1.0
// */
//public class StringTest5 {
//
//    @Test
//    public void test1() {
//        //编译期优化等同于"abc"
//        String s1 = "a" + "b" + "c";
//        //一定放在字符串常量池中的，将此地址赋值给s2
//        String s2 = "abc";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//    }
//
//    /**
//     * true
//     * false
//     * false
//     * false
//     * false
//     * false
//     * false
//     * true
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        String s1 = "javaEE";
//        String s2 = "hadoop";
//
//        String s3 = "javaEEhadoop";
//        String s4 = "javaEE" + "hadoop"; //编译期优化
//        //如果拼接符号前后出现变量，则相当于在堆空间中new String() ，具体的内容为拼接的结果：javaEEhadoop
//        String s5 = s1 + "hadoop";
//        String s6 = "javaEE" + s2;
//        String s7 = s1 + s2;
//
//        System.out.println(s3 == s4);
//        System.out.println(s3 == s5);
//        System.out.println(s3 == s6);
//        System.out.println(s3 == s7);
//        System.out.println(s5 == s6);
//        System.out.println(s5 == s7);
//        System.out.println(s6 == s7);
//
//        //intern():判断字符串常量池中是否存在javaEEhadoop，若存在则返回常量池中javaEEhadoop的地址；
//        // 如不存在，则在常量池中加载一份javaEEhadoop,并返回对象的地址
//        String s8 = s6.intern();
//        System.out.println(s3 == s8);
//    }
//
//
//    @Test
//    public void test3() {
//        String s1 = "a";
//        String s2 = "b";
//        String s3 = "ab";
//
//        //s2+s2执行细节：
//        //         * ①StringBuilder s = new StringBuilder();
//        //         * ②s.append("a");
//        //         * ③s.append("b");
//        //         * ④s.toString(); -->类似于 new String("ab");
//        //补充：在jdk5之 后使用的是StringBuilder，之前是StringBuffer
//        String s4 = s1 + s2;
//        System.out.println(s3 == s4); //false
//
//    }
//
//    /**
//     * 1、字符串拼接操作不一定使用的是StringBuilder！
//     * 如果拼接符号左右两边都是字符串常量或者常量引用，
//     * 则仍然使用编译期优化，即非StringBuilder的方式
//     * 2、针对final修饰类、方法、基本数据类型、引用数据类型的量的结构时，
//     * 能使用上final的时候建议使用
//     * final + 类 不能被继承
//     * final + 变量 变成常量
//     */
//    @Test
//    public void test4() {
//        final String s1 = "a";
//        final String s2 = "b";
//        String s3 = "ab";
//
//        String s4 = s1 + s2;
//        System.out.println(s3 == s4); //true
//
//    }
//
//    /**
//     * 通过StringBuilder的append()的方式添加字符串的效率要远高于使用String的字符串拼接方式！
//     * ①StringBuilder的append()方式：只创建一个StringBuilder对象
//     *      使用String的字符串拼接方式：创建过多个StringBuilder和String对象
//     * ②使用String的字符串拼接方式：
//     * 内存中由于创建了较多的StringBuilder和String对象，内存占用更大；如果GC花费时间更长
//     *
//     * 改进的空间：
//     * 在实际开发中，如果基本确定要前前后后添加的字符串长度不高于某个限定值highlevel的情况下，建议使用构造器
//     *  StringBuilder s = new StringBuilder(highlevel);
//     */
//}
