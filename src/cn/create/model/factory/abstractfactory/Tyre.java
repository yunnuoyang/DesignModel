package cn.create.model.factory.abstractfactory;

public interface Tyre {
    void revolve();
}
class LuxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("转的快");
    }
}
class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("转的慢");
    }
}
