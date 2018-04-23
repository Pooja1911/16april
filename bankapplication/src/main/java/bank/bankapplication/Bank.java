package bank.bankapplication;


import java.util.List;

public class Bank {
	
	private String name;

	
 
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



	public Bank(String name, List<Customer> customerList) {
		super();
		this.name = name;

		this.customerList = customerList;
	}

	
    List<Customer> customerList;
   
    


}
