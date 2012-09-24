/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package z06_MarcsExample;

/**
 *
 * @author Mark
 */
public class Person {
    
    private String name;
    
    public Person(String n)
    {
        name = n;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
        
}
