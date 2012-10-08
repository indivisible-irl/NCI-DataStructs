package t10_DoubleLinkedList;

public class DLNode<E> implements IDLNode<E>{

	//// data
	
	private E element;
	private IDLNode<E> prev;
	private IDLNode<E> next;
	
	//// constructor
	
	public DLNode(E o, DLNode<E> prv, DLNode<E> nxt){
		element = o;
		prev = prv;
		next = nxt;
	}

	//// override methods
	
	@Override
	public E getElement() {
		return element;
	}
	@Override
	public void setElement(E e) {
		element = e;	
	}
	@Override
	public IDLNode<E> getNext() {
		return next;
	}
	@Override
	public void setNext(IDLNode<E> n) {
		next = n;
	}

	@Override
	public IDLNode<E> getPrev() {
		return prev;
	}

	@Override
	public void setPrev(IDLNode<E> p) {
		prev = p;
	}
	
	@Override
	public String toString(){
		return element.toString();
	}
	
	
}
