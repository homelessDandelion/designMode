package com.company.singletonpattern.lazysingle03;


/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 11:25
 * 双重检查模式懒加载
 * 优点：保证了线程安全的同时且保证了效率
 **/
public class DoubleCheckLazySingleton {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(singleton==instance);
    }
    static class Singleton{
        private static volatile Singleton instance;

        //在用到的时候才实例对象,volatile防止线程中指令的重排序，使得其顺序执行
        //volatile不能保证其原子性，所以线程是不安全的，所以需要双重检查保证其安全性
        public static  Singleton getInstance(){
            if(instance!=null){
                synchronized (Singleton.class){
                    if (instance!=null){
                        instance=new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
