package cn.create.model.single;
//饿汉式,线程安全，
public class Singleton {
    //类初始化时，立即加载这个对象,线程安全
    private static Singleton instance=new Singleton();
    private Singleton(){//私有构造
    }
    //方法没有同步，调用效率高
    public  static Singleton getInstance(){
        return instance;
    }
}
