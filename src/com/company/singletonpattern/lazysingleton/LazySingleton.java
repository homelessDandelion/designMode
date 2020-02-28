package com.company.singletonpattern.lazysingleton;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 10:39
 * 懒汉式（线程不安全）
 * 优点：实现了懒加载
 * 缺点：只适用于单线程，不适用于多线程(同时加载则会产生多个实例)
 **/
public class LazySingleton {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(singleton==instance);
    }
    static class Singleton{
        private static Singleton instance;

        //在用到的时候才实例对象
        public static Singleton getInstance(){
            if(instance!=null){
                instance=new Singleton();
            }
            return instance;
        }
    }
}

