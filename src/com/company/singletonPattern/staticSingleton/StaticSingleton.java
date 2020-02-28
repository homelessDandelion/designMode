package com.company.singletonPattern.staticSingleton;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 09:48
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
