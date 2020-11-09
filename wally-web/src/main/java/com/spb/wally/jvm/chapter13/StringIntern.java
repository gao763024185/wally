//package com.spb.wally.jvm.chapter13;
//
///**
// * @description
// * @author: gaobh
// * @date: 2020/10/26 17:26
// * @version: v1.0
// */
//public class StringIntern {
//    public static void main(String[] args) {
//        String s = new String("1");
//        s.intern();
//        String s2 = "1";
//        System.out.println(s == s2);
//
//        String s3 = new String("1") + new String("1");
//        s3.intern();
//        String s4 = "11";
//        System.out.println(s3 == s4);
//    }
//}
