package cn.create.model.factory.abstractfactory;

public interface Engine{
    void start();
    void run();
}
class LuxcryEngine implements Engine{

    @Override
    public void start() {
        System.out.println("快速启动");
    }

    @Override
    public void run() {
        System.out.println("跑得快");
    }
}
class LowEngine implements Engine{

    @Override
    public void start() {
        System.out.println("慢速启动");
    }

    @Override
    public void run() {
        System.out.println("跑得慢");
    }
}
