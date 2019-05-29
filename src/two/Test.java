package two;

public class Test {
    public static void main(String[] args) {
        //使用工厂创建主题对象
        EquipmentFactory equipmentFactory=new EquipmentFactory();
        Equipment huawei = equipmentFactory.createEquipment("HUAWEI");
        huawei.introduce();
        //创建观察者对象
        Observer observer=new CloudObserver();
        huawei.attach(observer);

        huawei.change("有暴风来临");
        huawei.change("有大雪来临");
        huawei.detach(observer);
        Equipment xiaomi = equipmentFactory.createEquipment("XIAOMI");
        xiaomi.introduce();
        //创建观察者对象
        Observer observers=new CloudObserver();
        xiaomi.attach(observers);
        xiaomi.change("有暴风来临");
        xiaomi.change("有大雪来临");

    }
}
