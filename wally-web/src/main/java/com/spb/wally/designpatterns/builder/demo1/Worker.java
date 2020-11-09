package com.spb.wally.designpatterns.builder.demo1;


/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 18:01
 * @version: v1.0
 */
public class Worker extends Builder {

    private Product product;

    /**
     * 工人负责创建产品
     */
    public Worker() {
        this.product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基1");
        System.out.println("地基1");
    }

    @Override
    void buildB() {
        product.setBuildA("水泥");
        System.out.println("水泥");
    }

    @Override
    void buildC() {
        product.setBuildA("走线");
        System.out.println("走线");
    }

    @Override
    void buildD() {
        product.setBuildA("刷墙");
        System.out.println("刷墙");
    }

    @Override
    Product getProject() {
        return product;
    }

}
