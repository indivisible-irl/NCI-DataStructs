package tut04_Stacks;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int call = 0;
		// create a stack instance
		Stack<String> names = new Stack<String>();
		disp(names, ++call);		// 1
		
		names.push("popTest1");
		names.push("popTest2");
		
		// try a pop on empty, added try after
		divide(++call);				// 2
		try {
			System.out.println("Popped: " +names.pop());
		} catch (EmptyStackException e) {
			System.out.println("Tried to pop but nothing there.");
		}
		divide(++call);				// 3
		// or test for empty first
		if (names.isEmpty()){
			System.out.println("Tried to pop but nothing there.");
		} else {
			System.out.println("Popped: " +names.pop());
		}
		
		
		// push
		names.push(new String("Dave"));
		disp(names, ++call);		// 4
		
		// trying to add an integer to a String filled stack:
		//names.push(new Integer(4));
		// never going to work since we decided to cast Strings and not generic.
		// works if declared as:
		// Stack names = new Stack();
		
		// push a few more
		names.push("Jack");
		names.push("Jill");
		names.push("Bill");
		names.push("Ben");
		disp(names, ++call);		// 5
		
		// pop a couple
		divide();
		System.out.println("Popped: " +names.pop());
		System.out.println("Popped: " +names.pop());
		disp(names, ++call);		// 6
		
		// let's go over capacity
		names.push("filler");
		names.push("filler");
		names.push("filler");
		names.push("filler");
		names.push("filler");
		names.push("filler");
		names.push("filler");
		disp(names, ++call);		// 7
		names.push("filler");
		disp(names, ++call);		// 8
		
		// bring back down below 10 items to see if it downsizes
		// doesn't, inherits from Vector
		@SuppressWarnings("unused")
		String temp;
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		temp = names.pop();
		disp(names, ++call);		// 9
		
		// peek at next item without removing it
		System.out.println("Peek: " +names.peek());
		disp(names, ++call);		// 10
		System.out.println("Pop:  " +names.pop());
		disp(names, ++call);		// 11
		
		// refill for iteration
		names.push("Tom");
		names.push("Dick");
		names.push("Harry");
		disp(names, ++call);		// 12
		iterLoop(names);
		
		// for loops
		forLoop(names, true);	// forwards
		forLoop(names, false);	// backwards
	}

	// not what peek does, only looks at next
	private static void iterLoop(Stack<String> stack){
		divide();
		System.out.println("Stack contains:");
		Iterator<String> iter = stack.iterator();
		while (iter.hasNext()){
			System.out.println("\t" +iter.next());
		}
		divide();
	}
	private static void forLoop(Stack<String> stack, boolean goForwards){
		divide();
		System.out.print("Stack contains ");
		if (goForwards){
			System.out.print("(going from 0):\n");
			for (int i=0; i<stack.size(); i++){
				System.out.println("\t" +stack.get(i));
			}
		} else {
			System.out.print("(going from end):\n");
			for (int i=stack.size()-1; i>=0; i--){
				System.out.println("\t" +stack.get(i));
			}
		}
		
	}
	
	private static void disp(Stack<?> stack, int call){
		divide(call);
		System.out.println("Stack properties:");
		System.out.println("\tEmpty: " +stack.isEmpty());
		System.out.println("\tSize:  " +stack.size());
		System.out.println("\tCap:   " +stack.capacity());
		System.out.println("\tItems: " +stack.toString());
		divide();
	}
	private static void divide(int call){
		System.out.println("=============================== Call: " +String.format("%02d", call)+ " ==============================");
	}
	private static void divide(){
		System.out.println("=======================================================================");
	}
}
