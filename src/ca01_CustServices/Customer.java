/*
 * Data Structures and Algorithms
 * CA01 - RCPBank
 * Author: David Byrne - x12101575
 * Date: 26/09/2012
 */

package ca01_CustServices;

/**
 * A Class to represent a Customer of a bank
 * @author DavidA
 *
 */
public class Customer {

	//// data
	
	private String custName;
	private String custNumber;
	
	//// constructor
	
	public Customer(String cName, String cNum){
		setCustName(cName);
		setCustNumber(cNum);
	}

	//// get & set
	
	/**
	 * Return the Customer's name
	 * @return
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * Set the Customer's name
	 * @param custName
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * Get the Customer's Account Number. String used to allow for 0 at start of custNum and also alphanumerics.
	 * @return
	 */
	public String getCustNumber() {
		return custNumber;
	}
	/**
	 * Set the Customer's Account Number
	 * @param custNumber
	 */
	public void setCustNumber(String custNumber) {
		this.custNumber = custNumber;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(getCustNumber()).append("]  ").append(getCustName());
		return sb.toString();
	}
}
