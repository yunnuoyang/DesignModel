package one;

public class Product1 extends Product{
	private String name="product1";
	private GrayAlgorithm algorithm;
	private SmoothingAlgorithm smoothingAlgorithm;
	public Product1() {

	}
	
	public String getName() {
		return name;
	}

	public void proccessing() {
		algorithm=new LineAlgorithm();
		algorithm.proccessing();
		smoothingAlgorithm=new MidValueAlogrithm();
		smoothingAlgorithm.proccessing();
	}
	
	
}
