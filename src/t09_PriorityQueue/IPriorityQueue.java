package t09_PriorityQueue;

/**
 * Interface for Priority Queue ADTs
 * @author DavidA
 *
 */
public interface IPriorityQueue<E> {
	
	boolean enqueue(int p, E e);
	E dequeue();
	
	int size();
	boolean isEmpty();
	
	void printPQueue();

}
