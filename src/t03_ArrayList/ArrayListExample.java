package t03_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int call = 0;
		List<String> names = new ArrayList<String>();
		disp(names, call);
		
		names.add("John");
		disp(names, ++call);	// pre-increment so value gets +'ed BEFORE getting passed in
		names.add("Bill");
		names.add("Mary");
		names.add("Jill");
		names.add("Fred");
		names.add("Carol");
		disp(names, ++call);					//2
		
		names.add(3, "Spy");
		disp(names, ++call);					//3
		
		names.add("John");
		disp(names, ++call);					//4
		names.remove("John");
		disp(names, ++call);					//5
		
		check(names, "Fred");
		check(names, "Jimbo");
		
		getIndex(names, "Bill");
		getIndex(names, "Nope");
		
		names.add("John");
		getIndex(names, "John");
		getLastIndex(names, "John");
		getLastIndex(names, "What?");
		
		disp(names, ++call);					//6
		names.remove(names.lastIndexOf("Mary"));
		disp(names, ++call);					//7
		
		iterLoop(names);
		forLoop(names);
		forObjLoop(names);
		
		Collections.sort(names);
		disp(names, ++call);					//8
		Collections.shuffle(names);
		disp(names, ++call);					//9
		
		
	}
	
	private static void disp(List<String> list, int call){
		System.out.println("=============================== Call: " +String.format("%02d", call)+ " ==============================");
		System.out.println("List properties:");
		System.out.println("\tEmpty: " +list.isEmpty());
		System.out.println("\tSize:  " +list.size());
		System.out.println("\tItems: " +list.toString());
	}
//	private static void disp(List<String> list, int call, int index){
//		System.out.println("=============================== Call: " +String.format("%02d", call)+ " ==============================");
//		System.out.println("List properties:");
//		System.out.println("\tEmpty: " +list.isEmpty());
//		System.out.println("\tSize:  " +list.size());
//		System.out.println("\tItem "+index+ ": " +list.get(index));
//	}
	private static void check(List<String> list, String checkStr){
		System.out.println("============================================================================================");
		if(list.contains(checkStr)){
			System.out.println("List contains " +checkStr);
		} else {
			System.out.println("List not contains " +checkStr);
		}
	}
	private static int getIndex(List<String> list, String findStr){
		int found = list.indexOf(findStr);
		System.out.println("============================================================================================");
		if (found >= 0){
			System.out.println(findStr + " found at: " +found);
		} else {	// not found returns -1
			System.out.println(findStr + " not found.");
		}
		return found;
	}
	private static int getLastIndex(List<String> list, String findStr){
		int found = list.lastIndexOf(findStr);
		System.out.println("============================================================================================");
		if (found >= 0){
			System.out.println(findStr + " found at: " +found);
		} else {	// not found returns -1
			System.out.println(findStr + " not found.");
		}
		return found;
	}
	private static void iterLoop(List<String> list){
		Iterator<String> iter = list.iterator();
		System.out.println("============================================================================================");
		System.out.println("Using an Interator:");
		int i=0;
		while (iter.hasNext()){
			System.out.println("\t"+String.format("%02d", i)+": " +iter.next());
			i++;
		}
	}
	private static void forLoop(List<String> list){
		System.out.println("============================================================================================");
		System.out.println("Using a for loop (reverse):");
		for (int i=list.size()-1; i>=0; i--){
			System.out.println("\t"+String.format("%02d", i)+": " +list.get(i));
		}
	}
	private static void forObjLoop(List<String> list){
		System.out.println("============================================================================================");
		System.out.println("Using an object for loop:");
		int i=0;
		for (String str : list){
			System.out.println("\t"+String.format("%02d", i)+": " +str);
			i++;
		}
	}

}
