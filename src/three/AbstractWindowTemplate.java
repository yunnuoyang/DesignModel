package three;

public abstract class AbstractWindowTemplate {
    //定义流程的方法
    public void templateMethod(){
        initStepOne();
        jdbcLinkMethod();
        showDataToPage();
    }
     protected abstract  void jdbcLinkMethod();
    public void initStepOne(){
        System.out.println("查看有没有构件，设置行与行的颜色是交替的！");
    }
    public  void showDataToPage(){
        System.out.println("展示到页面的数据");
    }

}
