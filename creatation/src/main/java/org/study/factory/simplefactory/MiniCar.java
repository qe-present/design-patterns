package org.study.factory.simplefactory;

public class MiniCar extends AbstractCar{
    public MiniCar(){
        this.engine = "MiniCar engine";
        System.out.println("MiniCar created");
    }
    @Override
    public void run() {
        System.out.println("MiniCar is running");
    }
}
