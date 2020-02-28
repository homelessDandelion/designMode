package com.company.singletonpattern.staticsingleton2;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 10:16
 * 饿汉式静态代码块单例模式
 * 缺点：加载即实例对象，会造成内存浪费
 **/
public class StaticSingleton2 {

    public static void main(String[] args) {

        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance==instance2);
    }

    static class  Singleton02{
        private Singleton02() {

        }
        private static Singleton02 instance;
        static {
            instance=new Singleton02();
        }

        public static Singleton02 getInstance() {
            return instance;
        }
    }
}
