/*
 * Data Structures and Algorithms
 * CA01 - RCPBank
 * Author: David Byrne - x12101575
 * Date: 26/09/2012
 */

package ca01_CustServices;

import java.util.ArrayList;
import java.util.List;

/**
 * A Class to house and manipulate a generic Queue.
 * @author DavidA
 *
 * @param <E>
 */
public class Queue<E> implements IQueue<E>{

	//// data
	
	List<E> queue;
	
	//// constructor
	
	public Queue(){
		queue = new ArrayList<E>();
	}
	
	//// implement / override methods
	
	@Override
	public void enqueue(E e) {
		queue.add(e);
	}

	@Override
	public E dequeue() {
		if (isEmpty())
			return null;
		return queue.remove(0);
	}

	@Override
	public E front() {
		if (isEmpty())
			return null;
		return queue.get(0);
	}

	@Override
	public E rear() {
		if (isEmpty())
			return null;
		return queue.get(size()-1);
	}

	@Override
	public int aheadInQueue(E e) {
		if (queue.contains(e)){
			for (int i=0; i<queue.size(); i++){
				if(e.equals(queue.get(i)))
					// 0 based numbering so 1st in Queue = index 0 = objects ahead in Queue
					return i;
			}
		}
		// not in queue.
		return -1;
	}

	@Override
	public int size() {
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void disp() {
		divMinor();
		if (isEmpty())
			System.out.println("\tQueue is empty.");
		for (E e : queue){
			System.out.println("\t"+e.toString());
		}
		divMinor();
	}
	
	//// other methods
	
	/*
	 * A basic horizontal rule
	 */
	private void divMinor(){
		System.out.println("----------------------------------------");
	}

	
}
