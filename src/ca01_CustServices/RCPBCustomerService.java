/*
 * Data Structures and Algorithms
 * CA01 - RCPBank
 * Author: David Byrne - x12101575
 * Date: 26/09/2012
 */

package ca01_CustServices;

/**
 * An instance of the Queue class that exposes its functionality in a
 *    way that makes sense for the bank's purposes
 * @author DavidA
 *
 */
public class RCPBCustomerService {

	//// data
	
	private Queue<Customer> custs;
	
	//// constructor
	
	public RCPBCustomerService(){
		setCusts(new Queue<Customer>());
	}

	//// get & set
	
	/**
	 * Return the ArrayList of Customers
	 * @return
	 */
	public Queue<Customer> getCusts() {
		return custs;
	}

	/**
	 * Set the ArrayList of Customers
	 * @param custs
	 */
	public void setCusts(Queue<Customer> custs) {
		this.custs = custs;
	}
	
	//// functional methods
	
	/**
	 * Add a Customer to the end of the queue
	 * @param c
	 */
	public void newCustomer(Customer c){
		custs.enqueue(c);
	}
	/**
	 * Take the next Customer in line out.
	 * @return
	 */
	public Customer seeNext(){
		if (!custs.isEmpty())
			System.out.println(custs.front().toString()+ " aproaches the counter.");
		else
			System.out.println("There is nobody left in the queue!");
		return custs.dequeue();
	}
	/**
	 * Look at who is next in line but leave them there
	 * @return
	 */
	public Customer peekNext(){
		return custs.front();
	}
	/**
	 * See who is at the back of the queue
	 * @return
	 */
	public Customer peekLast(){
		return custs.rear();
	}
	/**
	 * Return the size of the queue
	 * @return
	 */
	public int queueSize(){
		return custs.size();
	}
	/**
	 * Check to see how many other Customers are ahead of the supplied one
	 * @param c
	 * @return
	 */
	public String peopleAheadOfCust(Customer c){
		int numAhead = custs.aheadInQueue(c);
		if (numAhead > 0)
			return String.format("%02d", numAhead);
		else if (numAhead == 0)
			return "nobody";
		return "no point in saying how many";
	}
	/**
	 * Check whether or not the queue is empty
	 * @return
	 */
	public boolean queueEmpty(){
		return custs.isEmpty();
	}
	
	
	public void disp(int call){
		System.out.println("========================================   Call: " +String.format("%02d", call));
		System.out.println("Customer Service Queue status:");
		System.out.println("\tThere are " +custs.size()+ " people queuing");
		custs.disp();
		System.out.println("========================================");
	}
	
}
