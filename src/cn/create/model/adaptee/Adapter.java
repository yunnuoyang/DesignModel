package cn.create.model.adaptee;

public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
            this.adaptee=adaptee;
    }

    @Override
    public void sampleOperator1() {
            this.adaptee.sampleOperator1();
    }

    @Override
    public void sampleOperator2() {
        System.out.println("Role:this is Adapter");
    }
}
