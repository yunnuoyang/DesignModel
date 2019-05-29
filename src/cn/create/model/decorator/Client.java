package cn.create.model.decorator;

public class Client {
    public static void main(String[] args) {
        /**
         * 被装饰的类
         */
        Model model=new Dress();
        /**
         * 装饰的类
         */
        MakeUp makeUp=new MakeUp(model);
        /**
         * 在这里边添加了新的打扮功能
         */
        makeUp.intorduce();
    }
}
