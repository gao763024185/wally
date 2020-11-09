package com.spb.wally.jvm.chapter05;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/12 16:51
 * @version: v1.0
 */
public class OperandStackTest {
    public void testAddOperation() {
        //byte、short、boolean、char ：都是以int形式存放
        byte i = 15;
        int j = 8;
        int k = i + j;
    }
}
