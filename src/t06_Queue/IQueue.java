package t06_Queue;

import java.util.Iterator;

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
	 * Display the contents and info about the Queue
	 */
	void disp(int callNumber);
	
	/**
	 * Return an Iterator for the Queue's list
	 * @return
	 */
	Iterator<E> getIterator();
}
