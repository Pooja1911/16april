package bank.bankapplication;


import java.util.List;

/**
 * @author Pooja
 * project name: Bank Application
 * project description: Bank class which has types of different bank in it
 *
 */
public class Bank extends Contact {
	
	private String name;
	 List<Customer> customerList;
	Contact contact;

	
 
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}



	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}



	/**
	 * @return the customerList
	 */
	public List<Customer> getCustomerList() {
		return customerList;
	}



	/**
	 * @param customerList the customerList to set
	 */
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	public Bank() {
		// TODO Auto-generated constructor stub
	}



	public Bank(String name, List<Customer> customerList, Contact contact) {
		super();
		this.name = name;
		this.customerList = customerList;
		this.contact = contact;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [name=" + name + ", customerList=" + customerList + ", contact=" + contact + "]";
	}



	

	
   
   
   

}
