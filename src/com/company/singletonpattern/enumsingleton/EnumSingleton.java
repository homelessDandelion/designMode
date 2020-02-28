package com.company.singletonpattern.enumsingleton;

/**
 * @program: designMode
 * @description
 * @author: Yuan JunTao
 * @create: 2020-02-28 12:22
 * 枚举单例模式
 * 优点：避免多线程问题，防止反序列化问题
 **/
public class EnumSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.Instance;
        Singleton instance1 = Singleton.Instance;
        System.out.println(instance==instance1);
    }


    enum Singleton{
        Instance;
        public void say(){
            System.out.println("hello");
        }
    }
}
