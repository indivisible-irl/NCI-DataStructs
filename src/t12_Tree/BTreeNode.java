package t12_Tree;

public class BTreeNode<E> implements IBTreeNode<E>{

	IBTreeNode<E> parent;
	IBTreeNode<E> left;
	IBTreeNode<E> right;
	
	E element;
	
	public BTreeNode(E e){
		parent = left = right = null;
		element = e;
	}
	
	
	@Override
	public boolean goRight(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IBTreeNode<E> getRight() {
		return right;
	}

	@Override
	public IBTreeNode<E> getLeft() {
		return left;
	}

	@Override
	public IBTreeNode<E> getParent() {
		return parent;
	}

	@Override
	public void setRight(IBTreeNode<E> tn) {
		right = tn;
	}

	@Override
	public void setLeft(IBTreeNode<E> tn) {
		left = tn;
	}

	@Override
	public boolean isLeaf() {
		return (left == null && right == null);
	}

	@Override
	public boolean isRoot() {
		return (parent == null);
	}

	@Override
	public E getElement() {
		return element;
	}

	@Override
	public void setElement(E e) {
		element = e;
	}

}
