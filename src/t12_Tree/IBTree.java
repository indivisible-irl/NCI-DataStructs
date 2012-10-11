package t12_Tree;

import java.util.List;

public interface IBTree<E> {

	void add(E e);
	E remove(E e);
	
	IBTreeNode<E> getRoot();
	
	boolean contains(E e);
	List<E> elements();
	
	boolean isEmpty();
	int size();
	
	void inorder();
	void postorder();
	void preorder();
	String toString();
}
