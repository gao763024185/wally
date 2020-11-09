package com.spb.wally.designpatterns.builder.demo1;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 9:52
 * @version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
