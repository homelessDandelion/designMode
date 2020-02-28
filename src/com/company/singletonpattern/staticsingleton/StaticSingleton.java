package com.company.singletonpattern.staticsingleton;

/**
 * @program: designMode
 * @description
 * 饿汉式静态常量式单例模式
 * @author: Yuan JunTao
 * @create: 2020-02-28 09:48
 * 缺点：加载即实例对象，会造成内存浪费
 **/
public class StaticSingleton {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }

 static class  Singleton{
        private Singleton() {

        }
        private final  static Singleton instance=new Singleton();

        public static Singleton getInstance() {
            return instance;
        }
    }
}
