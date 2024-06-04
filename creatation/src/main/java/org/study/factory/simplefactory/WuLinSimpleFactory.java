package org.study.factory.simplefactory;

/**
 * 简单工厂模式
 * 1、简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 2、产品数量少
 */
public class WuLinSimpleFactory {
    public AbstractCar newCar(String type) {
        // 从简
        if ("Van".equals(type)) {
            return new VanCar();
        } else if ("Mini".equals(type)) {
            return new MiniCar();
        } else {
            return null;
        }
        // 更多类型，违反开闭原则，应该直接扩展一个类
    }
}
