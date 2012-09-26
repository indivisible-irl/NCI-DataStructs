/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z05_SLLMarc;

/**
 *
 * @author Mark
 */
public class SingleLinkedListEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int callCounter = 0;
        
        SingleLinkedList sll = new SingleLinkedList();
        sll.add("Node1");
        Display(sll, ++callCounter);
        
        sll.add("Node3");
        Display(sll, ++callCounter);
        
        sll.add(2, "Node2");
        Display(sll, ++callCounter);
        
        sll.remove(2);
        Display(sll, ++callCounter);
    }
    
    public static void Display(ILinearList list, int callCounter)
    {
        System.out.println(":::::::: " + callCounter + " ::::::::");
        list.printList();
        System.out.println();
        System.out.println("IsEmpty: " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(":::::::::::::::::::");
        
    }
}
