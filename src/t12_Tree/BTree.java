package t12_Tree;

import java.util.ArrayList;
import java.util.List;

public class BTree<E> implements IBTree<E>{

	IBTreeNode<E> root;
	IBTreeNode<E> current;
	
	List<IBTreeNode<E>> sortedNodes;
	int size;
	
	public BTree(){
		root = current = null;
		sortedNodes = new ArrayList<IBTreeNode<E>>();
		size = 0;
	}
	
	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBTreeNode<E> getRoot() {
		return root;
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<E> elements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void inorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preorder() {
		// TODO Auto-generated method stub
		
	}

}
