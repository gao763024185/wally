package com.spb.wally.designpatterns.builder.demo2;

import org.springframework.cglib.beans.BulkBean;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 10:00
 * @version: v1.0
 */
public class Worker extends Builder {
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
