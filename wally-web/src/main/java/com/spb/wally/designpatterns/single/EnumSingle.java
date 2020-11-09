package com.spb.wally.designpatterns.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description
 *          enum 本身也是一个class类
 * @author: gaobh
 * @date: 2020/9/4 9:53
 * @version: v1.0
 */
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }
}


class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle single1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumSingle single2 = declaredConstructor.newInstance();
        System.out.println(single1);
        System.out.println(single2);
    }
}
