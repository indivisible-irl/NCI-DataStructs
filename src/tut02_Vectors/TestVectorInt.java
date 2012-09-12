package tut02_Vectors;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 * Class to test and work with a Vector of Integers
 * @author DavidA
 *
 */
public class TestVectorInt {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<Integer>();

		for (int i=0; i<=15; i++){
			numbers.add(i);
		}
		
		printVector(numbers);
		numbers = shuffleVector(numbers);
		printVector(numbers);
		numbers = sortVector(numbers);
		iterateVector(numbers);
	}

	/**
	 * Prints the contents of a Vector collection 
	 */
	private static void printVector(Vector<?> vector) {
		System.out.println("The Vector is:\n" + vector.toString() +"\n");
	}
	/**
	 * Shuffles the contents of a Vector.
	 * Should test to see if needs return or if the object will be modified
	 * @param vector
	 * @return
	 */
	private static Vector<Integer> shuffleVector(Vector<Integer> vector){
		Collections.shuffle(vector);
		return vector;
	}
	/**
	 * Sorts a Vector(Integer)
	 * @param vector
	 * @return
	 */
	private static Vector<Integer> sortVector(Vector<Integer> vector){
		Collections.sort(vector);
		return vector;
	}
	/**
	 * Iterate through a Vector and print a string for each entry
	 * @param vector
	 */
	private static void iterateVector(Vector<?> vector){
		Iterator<?> iter = vector.iterator();
		int i=0;
		while (iter.hasNext()){
			System.out.println("Loop number " +String.format("%02d", i)
					+": " +String.format("%02d", iter.next()));
			i++;
		}
	}
	
}
