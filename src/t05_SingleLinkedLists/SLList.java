package t05_SingleLinkedLists;

public class SLList implements ILinearList {

	//// data
	
    private Node head;
    private Node current;
    private Node previous;
    private int size;
    
    //// constructor
    
    public SLList() {
    	size = 0;
    }

    //// overrides
    
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public void add(Object element) {
		Node newNode = new Node(element, null);
		if (isEmpty()){			// could also have said "if (head == null)"
			head = newNode;
		} else {
			setCurrent(size-1);
			current.setNext(newNode);
		}
		size++;
	}
	@Override
	public void add(int index, Object element) {
		Node newNode = new Node(element, null);
		if (index == 0 && size == 0){
			add(newNode);
		} else if (index == 0){
			newNode.setNext(head);
			head = newNode;
		} else if (indexOK(index)){
			setCurrent(index);
			newNode.setNext(current);
			previous.setNext(newNode);
		} else {
			return;
		}
		size++;
	}
	@Override
	public void remove(int index) {
		if (indexOK(index)){
			setCurrent(index);
			previous.setNext(current.getNext());
			current = null;
			size--;
		}
	}
	@Override
	public void remove(Object o){
		//TODO make remove(prevNode, currNode) and use for index and obj remove
	}
	@Override
	public Object get(int index) {
		if (indexOK(index)){
			setCurrent(index);
		}
		return null;
	}
	@Override
	public void printList() {
		Node nextNode = head;
		
		System.out.print("< ");
		while (nextNode != null){
			System.out.print(nextNode.toString());
			nextNode = nextNode.getNext();
		}
		System.out.println(" >");
	}
	
	//// other methods
	
    /**
     * Set list position to supplied index
     * @param index
     */
	private void setCurrent(int index){
		//System.out.println("Start setCurrent(), index:"+index+", size:"+size);
		previous = null;
		current = head;
		
		// check for index too high and set to last element if it is
		if (index > size-1){
			index = size-1;
		}
		
		for (int i=0; i<index; i++){
			previous = current;
			current = current.getNext();
		}
	}
	/**
	 * Check if the LinearList contains the supplied Object
	 * @param o
	 * @return
	 */
	public boolean contains(Object o){
		boolean found = false;
		Node nextNode = head;
		while (nextNode != null){
			if (nextNode.getElement().equals(o)){
				found = true;
				break;
			}
			nextNode = nextNode.getNext();
		}
		return found;
	}
	/**
	 * Verify index is valid for current state of LinkedList (size and if empty)
	 * @param index
	 * @return
	 */
	private boolean indexOK(int index){
		if (size == 0 && index == 0){
			return true;
		} else if (index < size && index >= 0){
			return true;
		} else {
			System.out.println("!!\tIndex is outside range:\n\t\tIndex:" +index+ "\n\t\tRange: 0-" +(size-1));
			return false;
		}
	}

}
