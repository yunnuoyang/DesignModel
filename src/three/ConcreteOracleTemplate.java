package three;

public class ConcreteOracleTemplate extends  AbstractWindowTemplate {
    @Override
   public void jdbcLinkMethod() {
        System.out.println("连接oracle数据库，获取其中的数据........");
    }
}
