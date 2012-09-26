/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z06_QueueMarc;

/**
 *
 * @author Mark
 */
public interface IQueue<E> {
    
    void Enqueue(E e);
    E Dequeue();
    
    int size();
    boolean isEmpty();
    
    E front();
    
}
