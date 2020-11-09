package com.spb.wally.designpatterns.prototype.demo2;

import java.util.Date;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 11:31
 * @version: v1.0
 */
public class Bililili {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("高保红卡拉", date);
        Video video1 = (Video) video.clone();
        System.out.println("v1=>"+video);
        System.out.println("v2=>"+video1);

        System.out.println("***************************");

        date.setTime(138489);
        System.out.println("v1=>"+video);
        System.out.println("v2=>"+video1);

//        v1=>Video(name=高保红卡拉, createTime=Thu Sep 10 11:41:42 CST 2020)
//        v2=>Video(name=高保红卡拉, createTime=Thu Sep 10 11:41:42 CST 2020)
//***************************
//        v1=>Video(name=高保红卡拉, createTime=Thu Jan 01 08:02:18 CST 1970)
//        v2=>Video(name=高保红卡拉, createTime=Thu Sep 10 11:41:42 CST 2020)

        //以上这种情况属于深克隆

    }
}
