package org.study.singleton;

public class Person {
    private String name;
    private int age;

    private static class PersonInstance {
        private static final Person INSTANCE = new Person(); //饿汉模式
    }

    // 构造器私有化 外部不能new
    private Person() {
        System.out.println("Person instance created");
    }

    public static Person getInstance() {
        // 懒汉模式
        /*
        if (PersonInstance.INSTANCE == null) {
            PersonInstance.INSTANCE = new Person();
            }
         */

        return PersonInstance.INSTANCE;
    }
}
