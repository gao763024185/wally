package com.spb.wally.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description 懒汉式单例模式
 * 缺点： 单线程下可以，多线程不行
 * 双重检测锁模式+volatile  实现多线程
 * @author: gaobh
 * @date: 2020/9/3 16:07
 * @version: v1.0
 */
public class LazyMan {
    private static boolean gbh = false;

    private LazyMan() {
        //避免反射破坏单例
        synchronized (LazyMan.class) {
            if (!gbh) {
                gbh = true;
            } else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private volatile static LazyMan lazyMan;

    /**
     * 双重检测锁模式 懒汉式单例 DCL单例 Double Check Lock
     *
     * @return
     */
    public static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    //不是一个原子操作
                    //1、分配内存空间
                    //2、执行构造方法，初始化对象
                    //3、把这个对象指向这个空间
                    //在此期间会出现指令重排现象 所以需要volatile 防止指令重排
                    lazyMan = new LazyMan();
                }
            }
        }

        return lazyMan;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Field gbh = LazyMan.class.getDeclaredField("gbh");
        gbh.setAccessible(true);
        LazyMan instance = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        gbh.set(instance,false);
        LazyMan instance2 = declaredConstructor.newInstance();

//        LazyMan instance = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
    }
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//
//            new Thread(() -> {
//                LazyMan.getInstance();
//            }).start();
//
//        }
//    }
}
