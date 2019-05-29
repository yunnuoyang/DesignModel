package two;
//实现装备的接口
public class HUAWEIEquipment extends   Equipment{
    private  String state;

    public String getState() {
        return state;
    }
    public void change(String newState){
        System.out.println("更新前的状态为："+state);
        state=newState;
        System.out.println("更新后的状态为："+state);
        //状态发生改变，通知各个观察者
        this.nodifyObservers(state);
    }

    @Override
    public void introduce() {
        System.out.println("华为品牌的设备");
    }
}
