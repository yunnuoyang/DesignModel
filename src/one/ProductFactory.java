package one;
/*
简单工厂类
 */
public class ProductFactory {
    private Product product;
    public ProductFactory(Product product) {
        this.product=product;
    }

    public Product getProduct() {
        if ("product1".equals(this.product.getName())) {
            return new Product1();
        } else if ("product2".equals(this.product.getName())){
            return new Product2();
        }
        return null;
    }

}
