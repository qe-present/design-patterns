package org.study.factory.simplefactory;

/**
 * 具体产品类
 */
public class VanCar extends AbstractCar{
    public VanCar(){
        this.engine = "VanCar engine";
        System.out.println("VanCar created");
    }
    @Override
    public void run() {
        System.out.println("VanCar is running");
    }
}
