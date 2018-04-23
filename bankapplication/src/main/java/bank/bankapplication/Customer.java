package bank.bankapplication;

import java.util.List;

/**
 * @author trainee
 *
 */
public class Customer extends Contact{
	
	private String firstName;
	private String lastName;
	
 
/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


public Customer() {
	// TODO Auto-generated constructor stub
}


public Customer(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
}
List<Bank> listBank;
}


