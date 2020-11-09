package com.spb.wally.designpatterns.builder.demo1;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 9:51
 * @version: v1.0
 */
public class Director {
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProject();
    }
}
