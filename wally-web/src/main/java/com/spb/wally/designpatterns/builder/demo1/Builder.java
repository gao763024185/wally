package com.spb.wally.designpatterns.builder.demo1;


/**
 * @description 建造者模式
 * @author: gaobh
 * @date: 2020/9/9 17:57
 * @version: v1.0
 */
public abstract class Builder {
    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProject();
}
