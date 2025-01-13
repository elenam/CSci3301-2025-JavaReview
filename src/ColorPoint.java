public class ColorPoint extends Point {
	
	private String color; // What is the initial value of color? 
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); // call to the constructor of the superclass
		this.color = color;
	}
	
	// returns the color of a point
	public String getColor() {
		return color;
	}
	

}
