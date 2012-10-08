package t09_PriorityQueue;

import java.util.ArrayList;
import java.util.List;

//TODO change priority to a length two int array of priority and sub priority
public class PriorityQueue<E> implements IPriorityQueue<E> {

	//// data
	
	@SuppressWarnings("unused")
	private List<Integer> priorities;
	private Node head;
	private Node current;
	private Node previous;
	private int size;
	
	//// constructor
	
	public PriorityQueue(){
		priorities = new ArrayList<Integer>();
		head = null;
		current = null;
		previous = null;
		size = 0;
	}
	
	//// methods
	
//	@Override
//	public boolean enqueue(int p, E e) {
//		Integer pTest = new Integer(p);
//		if (priorities.contains(pTest)){
//			//TODO or throw exception?
//			return false;
//		} else {
//			priorities.add(pTest);
//			add(p, e);
//			size++;
//		}
//		return false;
//	}

	public boolean enqueue(int p, Node n){
		
		int index = findInsertPosition(p);
		
		if (index > size-1){
			add(p, e);
		} else {
			add(index, p, e);
		}
		
		return true;
	}
//	private void add(int p, Object e){
//		current = head;
//		int currentPriority = head.getPriority();
//		int nextPriority;
//		
//		if (p < currentPriority){
//			// insert as head
//			return;
//		}
//		
//		while (current.getNext() != null){
//			current = current.getNext();
//			nextPriority = current.getNext().getPriority();
//			
//			if (p > currentPriority && p < nextPriority){
//				// insert after current
//				return;
//			}
//			
//		} //end while
//		
//		// if it makes it through the while loop then throw on at the end
//		
//		
//	}
	
	private void add(int index, int p, E e) {
		Node newNode = new Node(p, e, null);
		if (index == 0 && size == 0){
			add(p, e);
		} else if (index == 0){
			newNode.setNext(head);
			head = newNode;
		} else if (indexOK(index)){
			setCurrent(index);
			newNode.setNext(current);
			previous.setNext(newNode);
		} else {
			return;
		}
		size++;
	}
	
	private void add(int p, E e){
		Node newNode = new Node(p, e, null);
		
		if (head == null){
			head = newNode;
		} else {
			setCurrent(size-1);
			current.setNext(newNode);
		}
	}
	
	/**
	 * Verify index is valid for current state of LinkedList (size and if empty)
	 * @param index
	 * @return
	 */
	private boolean indexOK(int index){
		if (size == 0 && index == 0){
			return true;
		} else if (index < size && index >= 0){
			return true;
		} else {
			System.out.println("!!\tIndex is outside range:\n\t\tIndex:" +index+ "\n\t\tRange: 0-" +(size-1));
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		if (isEmpty())
			return null;
		else {
			Node returnNode = head;
			head = head.getNext();
			//priorities.remove(returnNode.getPriority());
			size--;
			return (E) returnNode;
		}
		
	}
	
	
	/**
     * Set list position to supplied index
     * @param index
     */
	private void setCurrent(int index){
		//System.out.println("Start setCurrent(), index:"+index+", size:"+size);
		previous = null;
		current = head;
		
		// check for index too high and set to last element if it is
		if (index > size-1){
			index = size-1;
		}
		
		for (int i=0; i<index; i++){
			previous = current;
			current = current.getNext();
		}
	}
	
	private int findInsertPosition(int newPriority){
		Node node = head;
		boolean found = false;
		int position = 0;
		
		while (node != null && !found){
			if(node.getPriority() > newPriority){
				node = node.getNext();
				position++;
			} else {
				found = true;
			}
		}
		return position;
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size() == 0);
	}

	@Override
	public void printPQueue() {
		System.out.println("========================================");
		Node nextNode = head;
		if (isEmpty()){
			System.out.println("The Queue is empty.");
		} else {
			while (nextNode != null){
				System.out.print("[ ");
				System.out.print(nextNode.toString() + ", ");
				System.out.println("]");
			}
		}
		System.out.println("========================================");
	}
	
	//// get & set

}
