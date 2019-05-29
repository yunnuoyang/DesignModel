package two;

import java.util.ArrayList;
import java.util.List;

public abstract class Equipment {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("添加了一个观察者对象！");
    }

    /**
     * 删除观察者对象
     *
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("移除了一个观察者对象！");
    }

    public void nodifyObservers(String state) {
        for(Observer observer:observers) {
            observer.update(state);
            System.out.println("通知发布更新为："+state);
        };
    }
    abstract void change(String newState);

    abstract void introduce();
}
