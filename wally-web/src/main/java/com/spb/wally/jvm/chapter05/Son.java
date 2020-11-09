package com.spb.wally.jvm.chapter05;

/**
 * @description
 * @author: gaobh
 * @date: 2020/10/15 17:17
 * @version: v1.0
 */
    class Father{
        public Father() {
            System.out.println("father的构造器");
        }

        public static void showStatic(String string){
            System.out.println("father"+string);
        }

        public final void showFinal(){
            System.out.println("father show final");
        }

        public void showCommon(){
            System.out.println("father普通方法");
        }
    }

    public class Son extends Father{
        public Son() {
            super();
        }
        public Son(int age) {
            this();
        }

        /**
         * 不是重写父类方法   静态方法不能被重写
         * @param string
         */
        public static void showStatic(String string){
            System.out.println("son"+string);
        }

        private void showPrivate(String string){
            System.out.println("son private"+string);
        }

        public void show(){
            showStatic("gaobh");
            Father.showStatic("good!");
            showPrivate("hello");
            super.showCommon();
            showFinal();
            showCommon();
            info();

            MethosInterface in = null;
            in.methodA();
        }

        public void info(){

        }

        public static void main(String[] args){
            Son son = new Son();
            son.show();
        }
    }

    interface MethosInterface{
         void methodA();
    }
