package com.company.singletonpattern.staticsingleton03;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 11:55
 * 静态内部类
 * 避免了线程安全性问题，利用静态内部类的特点实现了延时加载，效率高
 **/
public class StaticSingleton03 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
    }

    static class Singleton {
        private Singleton() {

        }
        ;
        private static class InstanceSingleton{
            private final static Singleton singleton=new Singleton();
        }
        private static Singleton getInstance(){
            return InstanceSingleton.singleton;
        }
    }
}
