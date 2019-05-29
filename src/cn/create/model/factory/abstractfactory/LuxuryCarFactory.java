package cn.create.model.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxcryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
