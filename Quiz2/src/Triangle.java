
public class Triangle extends Shape {

	private double h;
	private double b;
	
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Triangle(String n,String c,double h,double b){
		
		super(n,c);
		this.b = b;
		this.h = h;
	}
	
	@Override
	public double CalculateArea() {
		
		return (h*b)/2;
	}

}
