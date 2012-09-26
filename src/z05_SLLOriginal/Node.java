/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package z05_SLLOriginal;

/**
 *
 * @author cmuntean
 */
public class Node {
      private Object element;
      private Node next;

      public Node(Object e, Node n){
		element = e;
		next = n;
	}

	public Node getNext() {
		return next;
	}

      public void setNext(Node n) {
		next = n;
	}

	public Object getElement() {
            return element;
      }

	public void setElement(Object e) {
		element = e;
      }

      public String toString() {
           	return element.toString();
      }
}
       //end of class Node
