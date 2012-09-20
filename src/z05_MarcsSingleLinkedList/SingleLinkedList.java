/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z05_MarcsSingleLinkedList;

/**
 *
 * @author Mark
 */
public class SingleLinkedList implements ILinearList {

    private Node head;
    private int size;
    private Node current;
    private Node previous;
    
    public SingleLinkedList() {
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return current;
    }

    @Override
    public void remove(int index) {
        // Special  case of removing the head node
        if(index == 1)
        {
            head = head.getNext();
        }
        else
        {
            // Find the previous and current node
            setCurrent(index);
            previous.setNext(current.getNext());
        }
        
        // decrement the size
        size--;
    }

    @Override
    public void add(int index, Object element) {
        // Special case of addng at the head of the list
        if(index == 1)
        {
            Node headNode = new Node(element, null);
            head = headNode;
        }
        else
        {
            setCurrent(index);
            Node newNode = new Node(element, current);
            previous.setNext(newNode);
        }
        
        // Increment the size
        size++;
    }

    @Override
    public void printList() {
        Node aNode = head;
        System.out.print("[ ");
        while(aNode != null)
        {
            System.out.print(aNode.toString());
            aNode = aNode.getNext();
        }
        System.out.print("]");
    }
    
    // Add an element at the end of the list
    public void add(Object element)
    {
        Node newNode = new Node(element, null);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            setCurrent(size);
            current.setNext(newNode);
        }
        
        size++;
    }
    
    private void setCurrent(int index)
    {
        // Sets the current to be the node at the position 
        // specified by the index and sets the previous to 
        // be the node previous to the current node
        previous = null;
        current = head;
        
        for(int i=1; i<index; i++)
        {
            previous = current;
            current = current.getNext();
        }
        
    }
    
}
