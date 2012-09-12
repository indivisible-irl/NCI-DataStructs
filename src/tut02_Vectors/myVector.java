package tut02_Vectors;

import java.util.Collections;
import java.util.Vector;

public class myVector {

	// vars
	Vector<String> vector;
	
	// constructors
	/**
	 * Constructor, no args, makes empty Vector(String)
	 */
	public myVector(){
		vector = new Vector<String>();
	}
	
	// methods
	/**
	 * Add an element
	 * @param addition
	 */
	public void add(String addition){
		vector.add(addition);
	}
	/**
	 * Print out the Vector contents as a string
	 */
	public void disp(){
		if (vector.isEmpty()){
			System.out.println("Vector is empty");
		} else {
			System.out.println("Vector contains:\n\t" + vector.toString());
		}
	}
	/**
	 * Get the current size of the Vector
	 * @return
	 */
	public int getSize(){
		return vector.size();
	}
	/**
	 * Default sort()
	 */
	public void sort(){
		Collections.sort(vector);
	}
	/**
	 * Remove an element at supplied index
	 * @param index
	 */
	public void remove(int index){
		vector.remove(index);
	}
	/**
	 * Remove the supplied object from the Vector
	 * @param string
	 */
	public void remove(String string){
		vector.remove(string);
	}
}
