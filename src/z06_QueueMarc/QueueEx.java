/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z06_QueueMarc;

/**
 *
 * @author Mark
 */
public class QueueEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IQueue<Person> people = new Queue<>();
        people.Enqueue(new Person("Mark"));
        
        Display(people, 0);
        DisplayFrontOfQueue(people);
       
        
        people.Enqueue(new Person("Mark"));
        people.Enqueue(new Person("Peter"));
        people.Enqueue(new Person("Mark"));
        people.Enqueue(new Person("Paul"));
        
        Display(people, 0);
        DisplayFrontOfQueue(people);
        
        people.Dequeue();
        
        Display(people, 0);
        DisplayFrontOfQueue(people);
                
    }
    
    private static void Display(IQueue<Person> q, int callCounter)
    {
        System.out.println("::::: " + " :::::");
        System.out.println("Items");
        System.out.println(q.toString());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(":::::::::::::");
    }
    
    private static void DisplayFrontOfQueue(IQueue<Person> q)
    {
        Person fp = (Person) q.front();
        System.out.println(fp.toString());
    }
}
