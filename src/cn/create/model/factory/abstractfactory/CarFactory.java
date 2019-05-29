package cn.create.model.factory.abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
