package cn.create.model.factory.factorymethod;
//工厂方法模式需要代码繁重
public class Client {
    public static void main(String[] args) {
        Car bm=new BMFactory().crateCar();
        Car ad=new AudiFactory().crateCar();
        bm.run();
        ad.run();
    }
}
