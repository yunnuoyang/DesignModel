package one;

public class Product2 extends Product{
	public String name="product2";
	private GrayAlgorithm algorithm;
	private SmoothingAlgorithm smoothingAlgorithm;
	public Product2() {
	}
	@Override
	public void proccessing() {
		algorithm=new NotLineAlgorithm();
		algorithm.proccessing();
		smoothingAlgorithm=new GaussAlgorithm();
		smoothingAlgorithm.proccessing();
	}

	@Override
	public String getName() {
		return name;
	}



}
