
public abstract class Shape {

	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
	
		color = c;
	}
	
	public Shape(){
		
		name = "";
		color = "";
	}
	
	public Shape(String n,String c){
		
		name = n;
		color = c;
	}
	
	public abstract double CalculateArea();
	
	@Override
	public String toString() {
		
		return String.format("Name :%s \nColor : %s\nCalculate Area : %.2f ", name,color,CalculateArea());	}
	
	
}
