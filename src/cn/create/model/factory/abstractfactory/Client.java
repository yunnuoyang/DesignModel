package cn.create.model.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory=new LuxuryCarFactory();
        carFactory.createEngine().run();
        carFactory.createSeat().message();
        carFactory.createTyre().revolve();
        CarFactory car=new LowCarFactory();
        car.createEngine().run();
        car.createSeat().message();
        car.createTyre().revolve();
    }
}
