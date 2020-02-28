package com.company.singletonpattern.lazysingle02;

import com.company.singletonpattern.lazysingleton.LazySingleton;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 10:57
 * 懒汉式（线程安全）
 * 优点：解决了线程安全的问题
 * 缺点：加载实例每次都需要同步，实际只需要实现一次
 **/
public class LazySingleton02 {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(singleton==instance);
    }
    static class Singleton{
        private static Singleton instance;

        //在用到的时候才实例对象,synchronized实现线程同步线程安全
        public static synchronized Singleton getInstance(){
            if(instance!=null){
                instance=new Singleton();
            }
            return instance;
        }
    }
}
