package cn.create.model.single;

/**
 * 双重检查锁实现单例
 */
public class SingleDoubleLock {
    private static SingleDoubleLock instance;
    private SingleDoubleLock(){}
    private static SingleDoubleLock getInstance(){
        if (instance==null){
            SingleDoubleLock sc;
            synchronized (SingleDoubleLock.class){
                sc=instance;
                if (sc==null){
                    synchronized (SingleDoubleLock.class) {
                        sc = new SingleDoubleLock();
                    }
                }
                instance=sc;
            }
        }

        return instance;
    }
}
