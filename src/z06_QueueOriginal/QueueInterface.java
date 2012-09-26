/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package z06_QueueOriginal;

/**
 *
 * @author cmuntean
 */
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object frontElement();
    public void enqueue(Object element);
    public Object dequeue();

}
