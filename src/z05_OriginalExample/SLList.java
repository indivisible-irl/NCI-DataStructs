/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package z05_OriginalExample;

/**
 *
 * @author cmuntean
 */
public class SLList implements LinearList
{
    private Node head;
    private int size;
    private Node curr;
    private Node prev;

    public SLList()
    {
      head = null;
      size = 0;
      curr = null;
      prev = null;
    }

    public boolean isEmpty()
    {
	 if (size ==0)
		return true;
	else
		return false;

    }

    public int size()
    {
	 return size;
    }

   // assume the index is in the correct range
   public void add(int index, Object item)
   {
   	// special case of adding at the head of the list
      if (index == 1)
      {
     	    Node newNode = new Node(item,head);
            head = newNode;
      }
      else
      {
            setCurrent(index);
            Node newNode = new Node(item, curr);
            prev.setNext(newNode);
      }
      size=size+1;
   }

   //add an elemenst at the end of the list
   public void add(Object element)
   {
     Node newNode = new Node(element,null);
     if (head == null ) {
       	head = newNode;
        }
     else {
         setCurrent(size);
         curr.setNext(newNode);
     }
      size = size+1;
  }

    public Object get(int index) {
      setCurrent(index);
      return curr;
  }

  public void remove(int index){
  // special case of removing at the head of the list
	if (index == 1){
            head = head.getNext();
	}
      else{
           // find the previous and current node
       	   setCurrent(index);
           prev.setNext(curr.getNext());
	}
      size = size -1;
  }

  private void setCurrent(int index){
      // sets curr to the node at position specified in index
      // sets prev to the node previous to curr
      int k;
      prev = null;
      curr = head;
      for (k  = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
      }
   }

    //************************************************************/
    // Provide a printlist() method which will print out       */
    // the content of the list                                  */
    //************************************************************/

    public void printList()
    {
        Node aNode = head;
        while (aNode != null) {
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
    }

}
