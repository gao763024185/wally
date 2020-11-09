package com.spb.wally.jvm.chapter08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/20 9:59
 * @version: v1.0
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
