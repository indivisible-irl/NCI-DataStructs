/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z05_SLLMarc;

/**
 *
 * @author Mark
 */
public class Node {
    private Object element;
    private Node next;
    
    // Node Constructor
    // e: the element to represent tbe the datum 
    // n: points at the next node in the list
    public Node(Object e, Node n)
    {
        element = e;
        next = n;
    }
    
    // Retrieves the next node in the list
    public Node getNext()
    {
        return next;
    }
    
    // Set the next node
    public void setNext(Node n)
    {
        next = n;
    }
    
    // Get the element
    public Object getElement()
    {
        return element;
    }
    
    // Set the element
    public void setElement(Object e)
    {
        element = e;
    }
    
    @Override
    public String toString()
    {
        return element.toString() + " ";
    }
    
}
