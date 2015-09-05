
public class Rectangle extends Square {

	private double y;
	
	
	
	public double getY() {
		return y;
	}



	public void setY(double y) {
		this.y = y;
	}



	public Rectangle(String n, String c, double x, double y) {
		super(n, c, x);
		this.y = y;
	}

	@Override
	public double CalculateArea(){
		
		return super.getX()*y;
		
		
	}
}
