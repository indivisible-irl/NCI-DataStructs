package t10_DoubleLinkedList;

public class DLListApp {

	public static void main(String[] args) {
		
		int warning;
		int call = 0;
		ILinearList<String> dList = new DLList<String>();
		
		dList.printList(PrintDirection.Forward, ++call);		// 1
		
		dList.add("one");
		dList.add("two");
		dList.add("three");
		
		dList.printList(PrintDirection.Forward, ++call);		// 2

		dList.remove(1);
		dList.printList(PrintDirection.Reverse, ++call);		// 3
		
		dList.add(0, "TWO");
		dList.printList(PrintDirection.Forward, ++call);		// 4
		
		dList.add("A");
		dList.add(dList.size(), "B");
		dList.printList(PrintDirection.Forward, ++call);		// 5
		
		dList.remove("A");
		dList.printList(PrintDirection.Forward, ++call);		// 6
		dList.remove(dList.size()-2);
		dList.printList(PrintDirection.Forward, ++call);		// 7
	}

}
