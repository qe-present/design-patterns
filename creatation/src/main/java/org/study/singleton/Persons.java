package org.study.singleton;

/*
singleton pattern
创建型模式
1、单例模式 保证一个类仅有一个实例，并提供一个访问它的全局访问点
 */
public class Persons {
    private String name;
    private int age;
    private volatile static  Persons instance;  // volatile 防止指令重排



    // 构造器私有化 外部不能new
    private Persons() {
        System.out.println("Person instance created");
    }
    // 1、 public static synchronized Person getInstance 锁太大
    // 2、双重检查锁+volatile
    public static  Persons getInstance() {
        if(instance == null){
            synchronized (Persons.class){
                if(instance == null){
                    instance = new Persons();
                }
            }
        }
        return instance;
    }
}
