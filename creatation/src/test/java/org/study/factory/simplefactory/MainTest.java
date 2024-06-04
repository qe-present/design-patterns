package org.study.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WuLinSimpleFactory factory = new WuLinSimpleFactory();
        AbstractCar car = factory.newCar("Van");
        car.run();
        car = factory.newCar("Mini");
        car.run();
    }
}
