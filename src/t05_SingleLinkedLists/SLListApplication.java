package t05_SingleLinkedLists;

public class SLListApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int call = 0;
        
        SLList sll = new SLList();
        disp(sll, ++call);		// 1
        
        sll.add("Node1");
        disp(sll, ++call);		// 2
        
        sll.add("Node3");
        disp(sll, ++call);		// 3
        
        sll.add(1, "Node2");
        disp(sll, ++call);		// 4
        
        sll.remove(1);
        disp(sll, ++call);		// 5
        
        String search = "Node3";
        if (sll.contains(search)){
        	System.out.println("Success!! List contains " +search);
        } else {
        	System.out.println("Oh no!!   List does not contain " +search);
        }
    }
    
    public static void disp(ILinearList list, int call)
    {
        System.out.println("============== " + String.format("%02d", call) + " ==============");
        list.printList();
        System.out.println("IsEmpty: " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println("================================");
        
    }
}
