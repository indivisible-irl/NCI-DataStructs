package t06_Queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Generic Queue Class. First in, First out
 * Need to get rid of the "Object"s
 * @author DavidA
 *
 */
public class Queue<E> implements IQueue<E>{

	private List<E> myQueue;
	
	public Queue(){
		myQueue = new ArrayList<E>();
	}
	@Override
	public void enqueue(E e) {
		myQueue.add(e);
	}
	@Override
	public E dequeue() {
		if (!isEmpty())
			return myQueue.remove(0);
		return null;
	}
	@Override
	public E front() {
		if (!isEmpty())
			return myQueue.get(0);
		return null;
	}
	@Override
	public E rear(){
		if (!isEmpty())
			return myQueue.get(size()-1);
		return null;		// or throw an out of bounds exception?
	}
	@Override
	public int size() {
		return myQueue.size();
	}
	@Override
	public boolean isEmpty() {
		return myQueue.isEmpty();
	}
	@Override
	public void disp(int callNumber){
		System.out.println("=============== Call " +String.format("%02d", callNumber)+ " ===============");
		System.out.println("\tEmpty:\t"   +isEmpty());
		System.out.println("\tSize:\t"    +size());
		System.out.println("\tFront:\t"   +front());
		System.out.println("\tRear: \t"   +rear());
		System.out.println("Contains:   " +toString());
		System.out.println("=======================================");
	}
	@Override
	public String toString(){
		return myQueue.toString();
	}
	
	/**
	 * Return where in the Queue the Object is. 
	 * @param o
	 * @return
	 */
	public int getPosition(E e){
		if (myQueue.contains(e)){
			for (int i=0; i<myQueue.size(); i++){
				if(myQueue.get(i).equals(e))
					return i+1;
			}
		}
		return 0;
	}
	public Iterator<E> getIterator(){
		Iterator<E> i = myQueue.iterator();
		return i;
	}

}
