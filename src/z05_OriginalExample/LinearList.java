/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package z05_OriginalExample;

/**
 *
 * @author cmuntean
 */
public interface LinearList {
        public boolean isEmpty();
	public int size();
	public Object get(int index);
	public void remove(int index);
	public void add(int index, Object theElement);
	public void printList();


}
