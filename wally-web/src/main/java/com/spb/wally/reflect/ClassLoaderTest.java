package com.spb.wally.reflect;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/27 17:02
 * @version: v1.0
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        // sun.misc.Launcher$AppClassLoader@b4aac2
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取其上层：扩展类加载器
        // sun.misc.Launcher$ExtClassLoader@edcd21
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //获取其上层：获取不到引导类加载器
        // null
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        //对于用户自定义类来说：默认使用系统类加载器进行加载
        //sun.misc.Launcher$AppClassLoader@b4aac2
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //String 使用引导类加载器加载的===>系统的核心内部都是使用引导类加载的
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);
    }
}
