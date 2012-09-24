package t06_Queue;

public class QueueEg {

	public static void main(String[] args){
		// call counter
		int call = 0;
		
		//// create a Queue
		Queue<String> myQueue = new Queue<String>();
		
		// quick peek:
		myQueue.disp(++call);				// 1
		
		// add something
		myQueue.enqueue("First in");
		myQueue.enqueue("Number two");
		
		myQueue.disp(++call);				// 2
		
		// try a dequeue
		String removed = (String) myQueue.dequeue();
		System.out.println("Removed: " +removed);
		myQueue.disp(++call);				// 3
		
		
		// enqueue and dequeue a few
		myQueue.enqueue("Random");
		myQueue.enqueue("More");
		myQueue.dequeue();
		myQueue.enqueue("Stuff");
		myQueue.dequeue();
		myQueue.enqueue("Still");
		myQueue.enqueue("Going");
		myQueue.enqueue("Strong");
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.disp(++call);				// 4
	}
}
