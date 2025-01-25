import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class UsingLambdas {

	public static void main(String[] args) {
		// The Collections.sort method sorts a collection, such as an ArrayList,
		// in the following way:
		// 1. If the type of the elements in the collection 
		// implements Comparable interface and no Comparator is passed 
		// to the sorting method, it sorts the elements from low to high
		// according to their compareTo method.
		// 2. If a comparator is passed to Collections.sort, its compare 
		// method is used for comparing two elements. 
		
		// A comparator is
		// a functional interface: it has a single method "compare"
		// that returns an integer. 
		// See https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Comparator.html
		// for interpretation of the integer.
		
		
		// A comparator can be used to overwrite the default comparison: 
		// Providing a comparator allows you to overwrite a default 
		// comparison for types that implement it. 
		ArrayList<Integer> numbers = new ArrayList<>();
		
		Random r = new Random(); // a random number generator
		
		// Generate a stream of 10 random integers between -10 and 10 inclusive:
		IntStream randomInts = r.ints(-10, 11).limit(10);
		// Add these integers to the array list:
		randomInts.forEach(numbers::add);
		
		// Print out the array list:
		System.out.println("Integers before sorting:");
		System.out.println(numbers);
		
		// Sort by the default comparison, print out the result:
		Collections.sort(numbers);
		System.out.println("Integers after default sorting:");
		System.out.println(numbers);
		
		// Sort by absolute value using a Comparator:
		Collections.sort(numbers, 
				(Comparator<Integer>) (n1, n2) -> Math.abs(n1) - Math.abs(n2));
		System.out.println("Integers after custom sorting:");
		System.out.println(numbers);
		
		// Q1: Generate an array list of 10 non-negative random integers less than 
		// 1 million. Then sort them (using Collections.sort and a comparator) by
		// the number of 1s in their binary representation. 
		// The static method Integer.toBinaryString(n) returns n as a binary string. 
		
		// If a type doesn't implement Comparable, 
		// a Comparator must be provided for sorting. 
		ArrayList<Point> points = new ArrayList<>();
		
		// creating 10 points at random
		for (int i = 0; i < 10; ++i) {
			points.add(new Point(r.nextInt(21)-10,r.nextInt(21)-10));
		}
		
		
		System.out.println("Points before sorting:");
		for (int i = 0; i < points.size(); ++i) {
			System.out.println(points.get(i));
		}
		
		// In the code below we create a comparator, implement the compare 
		// method using a lambda, and then pass the array list and the comparator
		// to Collections.sort to sort the points by x coordinate. 
		Collections.sort(points,
				(Comparator<Point>) (p1, p2) -> p1.getX() - p2.getX());
		
		System.out.println("Points after sorting by x coordinate:");
		for (int i = 0; i < points.size(); ++i) {
			System.out.println(points.get(i));
		}	
		
		// Q2: sort the points by their distance from zero,
		// using a comparator and a lambda
		// Note: distanceFromZero returns a double, and casting it to an int
		// loses precision. Multiply it by something large, like 1000, 
		// before casting to int.
		
		// Q3: Create an array list of 5 strings, use a Comparator
		// with lambda to sort them by their length.
		// If two strings have the same length, they are considered 
		// equal and their order is arbitrary.
		// Note that there is a shortcut for this that is mentioned in 
		// some tutorials, but I am asking you to follow a slightly longer
		// syntax above. 
	}

}