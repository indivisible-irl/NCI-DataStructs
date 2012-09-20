package t05_SingleLinkedLists;

/**
 * Interface for LinearLists.
 * @author David
 */
public interface ILinearList {
    
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
    public void add(Object element);
    /**
     * Add a new Node to the LinearList at the supplied index
     * @param index
     * @param element
     */
    public void add(int index, Object element);
    /**
     * Remove a Node from the LinearList at the specified index.
     * @param index
     */
    public void remove(int index);
    /**
     * Remove the first occurrence of a Node that contains the supplied Object
     * @param element
     */
    public void remove(Object element);
    /**
     * Return the Node at the specified position
     * @param index
     * @return
     */
    public Object get(int index);
    /**
     * Print the contents of the LinearList
     */
    public void printList();
}
