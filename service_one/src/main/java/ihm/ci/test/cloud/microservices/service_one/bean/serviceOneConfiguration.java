package ihm.ci.test.cloud.microservices.service_one.bean;

public class serviceOneConfiguration {

	private int maximum;
	private int minimum;
	
	
	public serviceOneConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public serviceOneConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
	
}
