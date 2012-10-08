package t10_DoubleLinkedList;

public interface IDLNode<E> {

	E getElement();
	void setElement(E e);
	
	IDLNode<E> getNext();
	void setNext(IDLNode<E> n);
	IDLNode<E> getPrev();
	void setPrev(IDLNode<E> n);
	
}
