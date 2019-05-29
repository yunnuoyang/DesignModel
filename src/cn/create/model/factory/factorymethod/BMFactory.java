package cn.create.model.factory.factorymethod;

public class BMFactory implements CarFactory {
    @Override
    public Car crateCar() {
        return new BM();
    }
}
