package three;

public class Test {
    public static void main(String[] args) {
        AbstractWindowTemplate abstractWindowTemplate=new ConcreteOracleTemplate();
        abstractWindowTemplate.templateMethod();
        abstractWindowTemplate=new ConcreteTemplate();
        abstractWindowTemplate.templateMethod();
    }
}
