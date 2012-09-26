/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package z05_SLLOriginal;

/**
 *
 * @author cmuntean
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLList sll = new SLList();
        sll.add(1,"Node1");
        sll.add(2,"Node2");
        sll.add(3, "Node3");
        sll.add(2,"NodeA");
        System.out.println("Size of list is " + sll.size());
        System.out.println("Is the list empty ? " + sll.isEmpty());

        System.out.println("Printing... ");
        sll.printList();
        sll.add("and another node");
        System.out.println("Printing again... ");
        sll.printList();

        sll.remove(2);
        System.out.println("Printing after removing the element on position 2... ");
        sll.printList();

       System.out.println("The element on position 3 is:" + sll.get(3));
    }


}
