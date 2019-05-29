package two;

/**
 * 暴风的观察者
 */
public class CloudObserver implements Observer {
    //观察者的状态
    private String observerstate;

    @Override
    public void update(String state) {
        observerstate = state;
        System.out.println("更新方法后的状态为：" + observerstate);
    }
}
