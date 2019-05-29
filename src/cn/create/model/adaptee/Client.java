package cn.create.model.adaptee;

public class Client {
    public static void main(String[] args) {
        Adapter adapter=new Adapter(new Adaptee());
        //适配器自己添加的新功能，
        adapter.sampleOperator2();
        //源类具有的功能
        adapter.sampleOperator1();
    }
}
