package com.spb.wally.designpatterns.prototype.demo2;

import lombok.Data;

import java.util.Date;

/**
 * @description
 * 1、实现一个接口
 * 2、重写一个方法
 * @author: gaobh
 * @date: 2020/9/10 11:27
 * @version: v1.0
 */
@Data
public class Video implements Cloneable{


    private String name;

    private Date createTime;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //深克隆 把对象也克隆一遍
        Object clone = super.clone();
        Video v = (Video) clone;
        v.createTime = (Date) this.createTime.clone();

        return clone;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }
}
