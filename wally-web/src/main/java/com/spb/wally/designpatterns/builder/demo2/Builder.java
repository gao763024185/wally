package com.spb.wally.designpatterns.builder.demo2;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 9:57
 * @version: v1.0
 */
public abstract class Builder {
    abstract Builder builderA(String msg);

    abstract Builder builderB(String msg);

    abstract Builder builderC(String msg);

    abstract Builder builderD(String msg);

    abstract Product getProduct();
}
