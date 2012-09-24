/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z06_MarcsExample;

import java.util.*;
/**
 *
 * @author Mark
 */
public class Queue<E> implements IQueue<E> {

    private ArrayList<E> list = new ArrayList<E>();   
   
    @Override
    public void Enqueue(E e) {
        list.add(e);
    }

    @Override
    public E Dequeue() {
        E item = list.get(0);
        
        list.remove(0);
        
        return item;        
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E front() {
        return list.get(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        Iterator<E> iter = list.iterator();
        while(iter.hasNext())
        {
            sb.append(iter.next()).append(" ");
        }
        
        return sb.toString();
    }
   
}
