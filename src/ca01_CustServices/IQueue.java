/*
 * Data Structures and Algorithms
 * CA01 - RCPBank
 * Author: David Byrne - x12101575
 * Date: 26/09/2012
 */

package ca01_CustServices;

/**
 * Interface for a generic Queue ADT
 * @author DavidA
 *
 * @param <E>
 */
public interface IQueue<E> {

	/**
	 * Add a new Object to the end of the Queue
	 * @param o
	 */
	void enqueue(E e);
	/**
	 * Remove and return the first Object from the front of the Queue
	 * @return
	 */
	E dequeue();
	
	/**
	 * Take a peek at the Object first in the Queue (front)
	 * @return
	 */
	E front();
	/**
	 * Take a peek at the last Object added to the Queue (rear)
	 * @return
	 */
	E rear();
	/**
	 * Return the position of an Object in the Queue
	 * @param e
	 * @return
	 */
	int aheadInQueue(E e);
	/**
	 * Returns the number of Objects in the Queue
	 * @return
	 */
	int size();
	/**
	 * Test whether or not the Queue has an items
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * Display the contents of the Queue
	 */
	void disp();
}
