package org.study.singleton;

import java.util.Properties;

public class MainTest {
    public static void main(String[] args) {
//        Person p1 = Person.getInstance();
//        Person p2 = Person.getInstance();
//        System.out.println(p1 == p2);
//        Properties properties = System.getProperties();
//        System.out.println(properties);
        System.getenv().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

    }
}
