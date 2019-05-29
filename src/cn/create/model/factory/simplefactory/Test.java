package cn.create.model.factory.simplefactory;

public class Test {
    public static void main(String[] args) {
        Car bm=CarFactory.createCar("宝马");
       bm.run();
    }
}
