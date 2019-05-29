package cn.create.model.factory.factorymethod;

public class AudiFactory implements CarFactory {
    @Override
    public Car crateCar() {
        return new Audi();
    }
}
