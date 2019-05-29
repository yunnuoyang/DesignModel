package cn.create.model.single;

/**
 * 通过匿名内部类完成延时加载的单例
 */
public class SingleClass {

    private static class SingleClassImpl{
       private static final   SingleClass instance=new SingleClass();
    }
    private SingleClass(){}
    public  static SingleClass getInstance(){
        return SingleClassImpl.instance;
    }
}
