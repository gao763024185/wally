package com.spb.wally.reflect;

import lombok.Data;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/24 16:01
 * @version: v1.0
 */
public class Test03 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

        //方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式二：forName获取
        Class c2 = Class.forName("com.spb.wally.reflect.Student");
        System.out.println(c2.hashCode());

        //方式三：通过类名.class获取
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四：基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4.hashCode());

        //获得父类类型
        Class<?> superclass = c1.getSuperclass();
        System.out.println(superclass.hashCode());
    }
}

@Data
class Person {
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}
