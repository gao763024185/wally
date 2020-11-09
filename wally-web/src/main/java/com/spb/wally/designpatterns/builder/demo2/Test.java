package com.spb.wally.designpatterns.builder.demo2;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 10:03
 * @version: v1.0
 */
public class Test {
    public static void main(String[] args){
        Worker worker = new Worker();
        //链式编程 在原来的基础上 可以自由组合，若是不组合也有默认值
        Product product = worker.builderA("肯德基").getProduct();
        System.out.println(product);
    }
}
