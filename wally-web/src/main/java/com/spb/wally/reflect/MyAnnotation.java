package com.spb.wally.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/24 15:21
 * @version: v1.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    String name() default "";
    String company() default "";

    //-1 代表不存在
    int age() default -1;
}

class Test {
    @MyAnnotation(name = "gaobh", age = 12)
    public void test() {
    }

}
