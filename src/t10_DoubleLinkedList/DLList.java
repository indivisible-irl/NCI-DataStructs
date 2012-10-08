package t10_DoubleLinkedList;

public class DLList<E> implements ILinearList<E>{

	//// data
	
	IDLNode<E> headNode;
	IDLNode<E> tailNode;
	IDLNode<E> currNode;
	int size;
	
	//// constructor
	
	public DLList(){
		headNode = tailNode = currNode = null;
		size = 0;
	}
	
	//// override methods
	
	@Override
	public boolean isEmpty() {
		if (headNode == null)
			return true;
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(E e) {
		if (size() == 0){
			IDLNode<E> newNode = new DLNode<E>(e, null, null);
			headNode = tailNode = currNode = newNode;
		} else {
			addTail(e);
		}
		size++;
	}

	@Override
	public void add(int insertAfter, E e) {
		if (size() == 0){
			addHead(e);
		}
		else if (insertAfter == -1){
			addHead(e);
		}
		else if (insertAfter == size()){
			addTail(e);
		} else {
			setCurrent(insertAfter);
			IDLNode<E> newNode = new DLNode<E>(e, null, null);
			
			newNode.setPrev(currNode);
			newNode.setNext(currNode.getNext());
			currNode.setNext(newNode);
			currNode.getNext().setPrev(newNode);
		}
		size++;
	}

	@Override
	public E remove(int index) {
		E returnE = null;
		if (size == 0)
			return returnE;
		else if (index == 0 && size() != 0)
			return removeHead();
		else if (index == 0 && size() == 1){
			returnE = headNode.getElement();
			headNode = null;
			size--;
		} else {
			setCurrent(index);
			returnE = currNode.getElement();
			
			currNode.getPrev().setNext(currNode.getNext());
			currNode.getNext().setPrev(currNode.getPrev());
			currNode = null;
			size--;
		}
		return returnE;
	}

	@Override
	public E remove(E e){
		if (headNode == null)
			return null;
		currNode = headNode;
		while (currNode.getNext() != null) {
			if (e.equals(currNode.getElement()))
				break;
			currNode = currNode.getNext();
		}
		return removeCurrent();
	}
	
	private E removeHead(){
		if (headNode == null)
			return null;
		E returnE = headNode.getElement();
		
		headNode.getNext().setPrev(null);
		headNode = headNode.getNext();
		
		size--;
		return returnE;
	}
	
	private E removeCurrent(){
		if (currNode == null)
			return null;
		E returnE = currNode.getElement();
		
		currNode.getPrev().setNext(currNode.getNext());
		currNode.getNext().setPrev(currNode.getPrev());
		currNode = null;
		
		size--;
		return returnE;
	}

	@Override
	public E get(int index) {
		setCurrent(index);
		return currNode.getElement();
	}

	@Override
	public void printList(PrintDirection pd, int call) {
		System.out.println(info(pd, call));
	}
	
	@Override
	public String toString(){
		int call = 0;
		return info(PrintDirection.Forward, call);
	}
	
	//// functional methods
	
	private void addHead(E e){
		IDLNode<E> newNode = new DLNode<E>(e, null, null);
		if (size() == 0){
			headNode = newNode;
		} else {
			newNode.setNext(headNode);
			headNode = newNode;
		}
	}
	
	private void addTail(E e){
		IDLNode<E> newNode = new DLNode<E>(e, null, null);
		newNode.setPrev(tailNode);
		tailNode.setNext(newNode);
		tailNode = newNode;
	}
	
	private void setCurrent(int index){
		if (startFromHead(index))
			setCurrentForwards(index);
		else
			setCurrentBackwards(index);
	}
	
	private void setCurrentForwards(int index){
		int count = 0;
		currNode = headNode;
		
		while (currNode.getNext() != null){
			if (count == index)
				break;
			currNode = headNode.getNext();
			count++;
		}
	}
	
	private void setCurrentBackwards(int index){
		int count = size()-1;
		currNode = tailNode;
		
		while (currNode.getPrev() != null){
			if (count == index)
				break;
			currNode = tailNode.getPrev();
			count--;
		}
	}
	private boolean startFromHead(int index){
		if (!verifyIndex(index))
			throw new IndexOutOfBoundsException("Index is outside bounds");
		if (index < (size() / 2))
			return true;
		return false;
	}
	
	private boolean verifyIndex(int index){
		if (size == 0 && index == 0)
			return true;
		if (index <= size-1)
			return true;
		else
			return false;
	}
	
	private String info(PrintDirection pd, int call){
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("=======================================  Call %02d\n", call));
		sb.append("DoubleLinkedList Info:\n");
		sb.append("\tSize:\t"  + size() + "\n");
		sb.append("\tEmpty:\t" + isEmpty() + "\n");
		sb.append("---------------------------------------\n");
		if (size() == 0){
			sb.append("List is empty.\n");
		} else {
			switch(pd){
			case Forward:
				sb.append(toStringForward());
				break;
			case Reverse:
				sb.append(toStringReverse());
				break;			
			default:
				sb.append(toStringForward());
				break;
			}
		}
		sb.append("=======================================\n");
		return sb.toString();
	}
	private String toStringForward(){
		StringBuilder sb = new StringBuilder();
		sb.append("Forwards:\n");
		sb.append("\t[ ");
		IDLNode<E> nextNode = headNode;
		while (nextNode.getNext() != null){
			sb.append(nextNode.toString());
			nextNode = nextNode.getNext();
			sb.append(", ");
		}
		sb.append(nextNode.toString());
		sb.append(" ]\n");
		return sb.toString();
	}
	private String toStringReverse(){
		StringBuilder sb = new StringBuilder();
		sb.append("Reverse:\n");
		sb.append("\t[ ");
		IDLNode<E> previousNode = tailNode;
		while (previousNode.getPrev() != null){
			sb.append(previousNode.toString());
			previousNode = previousNode.getPrev();
			sb.append(", ");
		}
		sb.append(previousNode.toString());
		sb.append(" ]\n");
		return sb.toString();
	}

}
