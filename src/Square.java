/*
 * A class that represents a square with an integer side.
 */

public class Square {
	protected int side;
	
	/*
	 * A constructor that takes the side
	 */
	public Square(int side) {
		this.side = side;
	}
	
	/*
	 * The set method to set the sides of a square
	 */
	public void setSide(int side) {
		this.side = side;
	}
	
	/*
	 * A method that returns the area of a square
	 */
	public int area() {
		return side * side;
	}
	
	/*
	 * A method that returns the perimeter of a square
	 */
	public int perimeter() {
		return 4 * side;
	}

	/*
	 * Returns true since the two sides of a square are always equal
	 */
	public boolean sidesEqual() {
		return true;
	}
}
