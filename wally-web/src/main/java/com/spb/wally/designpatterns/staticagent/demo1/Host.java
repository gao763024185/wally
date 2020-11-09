package com.spb.wally.designpatterns.staticagent.demo1;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:18
 * @version: v1.0
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
