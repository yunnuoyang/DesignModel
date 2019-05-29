package three;

public class ConcreteTemplate extends  AbstractWindowTemplate {
    @Override
   public void jdbcLinkMethod() {
        System.out.println("连接mysql数据库，获取其中的数据........");
    }
}
