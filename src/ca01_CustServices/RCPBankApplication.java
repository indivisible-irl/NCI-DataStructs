/*
 * Data Structures and Algorithms
 * CA01 - RCPBank
 * Author: David Byrne - x12101575
 * Date: 26/09/2012
 */

/*
 * Answering the textual part of the question:
 * 
 * I selected a Queue encompassing an ArrayList as my ADT because of:
 * 	  Queue:
 * 		- "First in, First out" structure matching the requirements.
 * 	  ArrayList:
 * 		- its ease of adding objects to the end
 * 		- elasticity (easily vary length)
 * 		- easy access to items through index
 * 		- easy access to index through objects
 * 		- experience using them compared to other ADTs
 * 
 * 		- also in case I got short of time or hit errors
 * 			I could just ctrl+c/v from the examples and tutorials already done... 
 * 	
 */
package ca01_CustServices;

public class RCPBankApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// counter to keep track of the console compared to code
		int cnt = 0;
		
		// init customer service queue
		RCPBCustomerService custQueue = new RCPBCustomerService();
		custQueue.disp(++cnt);												// call 1
		
		// add a few customers
		custQueue.newCustomer(new Customer("Tom", "0123456789"));
		custQueue.newCustomer(new Customer("Dick", "1234567890"));
		custQueue.newCustomer(new Customer("Harry", "2345678901"));
		custQueue.disp(++cnt);												// call 2
		
		// receptionist wants to know who is next in line?
		System.out.println();
		System.out.println("Receptionist: 'Are there people queuing?");
		if (custQueue.queueEmpty())
			System.out.println("\tThere are no people in the queue");
		else
			System.out.println("\tThere are " +custQueue.queueSize()+ " people waiting.");
		System.out.println("Receptionist: 'Who is next?'");
		System.out.println("\t"+custQueue.peekNext().toString());
		System.out.println();
		
		// more join the queue
		Customer jack = new Customer("Jack", "ABC123U&ME");
		Customer jill = new Customer("Jill", "123ABCDRME");
		custQueue.newCustomer(jack);
		custQueue.newCustomer(jill);
		custQueue.disp(++cnt);												// call 3
		
		// the receptionist finally gets off the phone to her sister
		System.out.println("Receptionist: 'I will see the next person now'");
		custQueue.seeNext();
		custQueue.disp(++cnt);												// call 4
		
		// Jack begins to get impatient and counts the people ahead of him
		System.out.println("There's " +custQueue.peopleAheadOfCust(jack)+
				" ahead of " +jack.getCustName());
		divMinor();
		
		// a younger, more attentious receptionist opens up another desk and things begin to move
		custQueue.seeNext();
		custQueue.seeNext();
		
		// jill needs to pee and counts ahead
		divMinor();
		System.out.println("There's " +custQueue.peopleAheadOfCust(jill)+
				" ahead of " +jill.getCustName());
		custQueue.disp(++cnt);												// call 5
		
		// jack gets a good seeing to
		custQueue.seeNext();
		System.out.println("There's " +custQueue.peopleAheadOfCust(jill)+
				" ahead of " +jill.getCustName());
		
		// jill finally, after hours of crossing her legs gets to the desk
		divMinor();
		custQueue.seeNext();
		custQueue.disp(++cnt);												// call 6
		
		// are there stil people in the queue?
		System.out.println("Receptionist: 'Are there people queuing?");
		if (custQueue.queueEmpty())
			System.out.println("\tThere are no people in the queue");
		else
			System.out.println("\tThere are " +custQueue.queueSize()+ " people waiting.");
		
		
		// i wonder...
		divMinor();
		divMinor();
		divMinor();
		System.out.println("There's " +custQueue.peopleAheadOfCust(jack)+
				" ahead of " +jack.getCustName());
		
	}
	
	/**
	 * print a smaller horizontal rule
	 */
	public static void divMinor(){
		System.out.println("----------------------------------------");
	}

}
