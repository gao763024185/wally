package com.spb.wally.designpatterns.bridge;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 15:26
 * @version: v1.0
 */
public abstract class Computer {
    //组合品牌
    protected Brand brand;
    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        //自带品牌
        brand.info();
    }

}


class Desktop extends Computer{


    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("台式机");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("笔记本");
    }
}