package cn.create.model.single;
//避免反射反序列化，本身就是单例
//没有懒加载的效果
public enum Single {
    INSTANCE;
    //添加自己的操作
    public Single getInstance(){
        return INSTANCE;
    }

}
