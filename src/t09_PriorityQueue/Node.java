package t09_PriorityQueue;



/**
 * Single Node for a PriorityQueue
 * @author DavidA
 *
 */
public class Node{
	
	//// data
	
	private int priority;
	private Object element;
	private Node next;
	
	//// constructor
	
	public Node(int priorityIn, Object object, Node nextNode){
		priority = priorityIn;
		element = object;
		next = nextNode;
	}
	
	//// methods
	
	public int getPriority(){
		return priority;
	}
	
	public void setPriority(int p){
		priority = p;
	}
	
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
        return element.toString();
    }
    

}
