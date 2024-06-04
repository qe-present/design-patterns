package org.study.prototype;

import java.util.HashMap;
import java.util.Map;

/*
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能
本质克隆对象
 */
public class MyMybatis {
    private Map<String, User> userCache =new HashMap<>();
    /*
    从数据库中获取用户信息
     */
    public User getUser(String name) throws CloneNotSupportedException {
        User user=null;
        // 模拟从数据库中获取用户信息
        if(!userCache.containsKey(name)){
            // 从数据库中获取用户信息
            user = getUserFromDb(name);


        }else {
            // 从缓存中获取用户信息 脏缓存
            // 原型已经拿到，但是不能直接返回，因为原型是共享的，需要克隆一份
            user = userCache.get(name);
            // 克隆一份 原型模式
            user = (User) user.clone();
        }
        return user;

    }

    private User getUserFromDb(String name) throws CloneNotSupportedException {
        System.out.println("从数据库中获取用户信息：" + name);
        User user = new User();
        user.setName(name);
        user.setAge(18);
        // 缓存中放一份clone
        userCache.put(name, (User) user.clone());
        return user;

    }

}
