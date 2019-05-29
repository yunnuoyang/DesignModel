package cn.create.model.single;
//懒汉模式，延迟加载，真正使用的时候加载
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}
    public static synchronized  SingletonLazy getInstance(){
      if (instance==null){
          instance=new SingletonLazy();
          //资源利用率高了，同步,调用率低
      }
        return instance;
    }
}
