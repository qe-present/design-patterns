package org.study.prototype;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyMybatis myMybatis = new MyMybatis();
        User user = myMybatis.getUser("zhangsan");
        System.out.println(user);
        user.setName("lisi");
        User user1 = myMybatis.getUser("zhangsan");
        System.out.println(user1);

        User userz2 = myMybatis.getUser("zhangsan");
        System.out.println(userz2);
        User userz3 = myMybatis.getUser("zhangsan");
        System.out.println(userz3);



    }
}
