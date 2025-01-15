/*
 * A rectangle with integer sides.
 */

public class Rectangle {
	protected int side1;
	protected int side2;
	
	/*
	 * A constructor that takes two sides
	 */
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	/*
	 * A set method for side1
	 */
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	
	/*
	 *  A set method for side1
	 */
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
	/*
	 * A method that returns the area of a rectangle
	 */
	public int area() {
		return side1 * side2;
	}
	
	/*
	 * A method that returns the perimeter of a rectangle
	 */
	public int perimeter() {
		return 2 * side1 + 2 * side2;
	}
	
	/*
	 * A method that returns true if the two sides of the rectangle 
	 * are equal and false otherwise
	 */
	public boolean sidesEqual() {
		return side1 == side2;
	}
	
}
