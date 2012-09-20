package t05_SingleLinkedLists;

/**
 * Basic Node class to store an Object and a pointer to the next Node in the LinearLinkedList.
 * @author David
 */
public class Node {
	
	//// data
	
    private Object element;
    private Node next;
    
    //// constructor
    
    public Node(Object e, Node n) {
        element = e;
        next = n;
    }
    
    //// get & set
    
    /**
     * Get this Node's next pointer
     * @return
     */
    public Node getNext() {
        return next;
    }
    /**
     * Set this Node's next pointer
     * @param n
     */
    public void setNext(Node n) {
        next = n;
    }
    /**
     * Get the Object stored in this node
     * @return
     */
    public Object getElement() {
        return element;
    }
    /**
     * Set the Object stored in this Node
     * @param e
     */
    public void setElement(Object e) {
        element = e;
    }
    
    @Override
    public String toString() {
        return element.toString() + " ";
    }
    
}
