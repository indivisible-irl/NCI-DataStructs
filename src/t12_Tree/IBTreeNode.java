package t12_Tree;

public interface IBTreeNode<E> {

	boolean goRight(E e);
	
	IBTreeNode<E> getRight();
	IBTreeNode<E> getLeft();
	IBTreeNode<E> getParent();
	
	void setRight(IBTreeNode<E> tn);
	void setLeft(IBTreeNode<E> tn);
	
	boolean isLeaf();
	boolean isRoot();
	
	E getElement();
	void setElement(E e);
	
}
