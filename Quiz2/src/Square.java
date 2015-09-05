
public class Square extends Shape {

	private double x;
	
	
	
	public double getX() {
		return x;
	}



	public void setX(double x) {
		this.x = x;
	}

public Square(String n,String c ,double x){
	
	super(n,c);
	this.x = x;
}

	@Override
	public double CalculateArea() {
		
		return x * x;
	}

}
