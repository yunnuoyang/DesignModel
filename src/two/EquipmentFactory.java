package two;

//负责生产装备的工厂
public class EquipmentFactory {
    public Equipment createEquipment(String name) {
        if ("HUAWEI".equals(name)) {
            return new HUAWEIEquipment();
        }else if("XIAOMI".equals(name)||name==null)
         return new XIAOMIEquipment();
         return null;
    }
}
