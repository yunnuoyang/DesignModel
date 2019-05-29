package cn.create.model.factory.simplefactory;

public class CarFactory {
    /**
     * 简单工厂方法没有满足开闭原则ocp原则
     * @param type
     * @return
     */
    public static Car createCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        }else if ("宝马".equals(type)){
            return new BM();
        }else{
            return null;
        }
    }
}
