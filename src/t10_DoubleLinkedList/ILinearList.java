package t10_DoubleLinkedList;

/**
 * Interface for LinearLists.
 * @author David
 */
public interface ILinearList<E> {
    
	/**
	 * Check whether or not the LinearList is empty
	 * @return
	 */
    public boolean isEmpty();
    /**
     * Get the current size of the LinearList
     * @return
     */
    public int size();
    /**
     * Add a new Node to the end of the LinearList
     * @param element
     */
    public void add(E e);
    /**
     * Add a new Node to the LinearList at the supplied index
     * @param index
     * @param element
     */
    public void add(int index, E e);
    /**
     * Remove a Node from the LinearList at the specified index.
     * @param index
     */
    public E remove(int index);
    /**
     * Remove the first occurrence of a Node that contains the supplied Object
     * @param element
     */
    public E remove(E e);
    /**
     * Return the Node at the specified position
     * @param index
     * @return
     */
    public E get(int index);
    /**
     * Print the contents of the LinearList
     */
    public void printList(PrintDirection pd, int callNum);
}
