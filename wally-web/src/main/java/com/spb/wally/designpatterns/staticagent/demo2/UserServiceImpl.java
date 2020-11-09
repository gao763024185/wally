package com.spb.wally.designpatterns.staticagent.demo2;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/10 16:28
 * @version: v1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("使用了add方法");
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("使用了delete方法");
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("使用了update方法");
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("使用了query方法");
        System.out.println("查找一个用户");
    }
}
