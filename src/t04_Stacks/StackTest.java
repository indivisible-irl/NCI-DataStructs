package t04_Stacks;

import java.util.Stack;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<=5; i++){
			stack.push(new Integer(i));
			System.out.println("Pushed: " +i+ "\n\tStack size: " +stack.size());
		}
		for (int i=5; i>=0; i--){
			System.out.println("Pop: " +stack.pop()+ "\n\tSize: " +stack.size()+ "\n\tIs empty: " +stack.isEmpty());
		}
		
	}

}
