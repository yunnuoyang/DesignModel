package one;

public class Client {
    public static void main(String[] args) {
        ProductFactory productFactory=new ProductFactory(new Product1());
        Product product = productFactory.getProduct();
        product.proccessing();
        System.out.println(product.getName());;
        //
        ProductFactory productFactory2=new ProductFactory(new Product2());
        Product product2 = productFactory2.getProduct();
        product2.proccessing();
        System.out.println(product2.getName());;

    }
}
