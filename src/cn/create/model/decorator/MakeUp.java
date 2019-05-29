package cn.create.model.decorator;

/**
 * 装饰Dress的类
 */
public class MakeUp extends Dress {
    private  Model model;
    public MakeUp(Model model) {
        this.model=model;
    }

    @Override
    public void intorduce() {

        super.intorduce();
        this.dressed();
    }

    public void dressed(){
        System.out.println("穿上了衣服！打扮完成！");
    }
}
