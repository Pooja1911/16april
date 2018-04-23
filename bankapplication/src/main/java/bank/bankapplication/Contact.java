
package bank.bankapplication;

/**
 * @author trainee
 *
 */
public class Contact extends Address {
	private PhoneNumber phone;
	private PhoneNumber mobile;
	private Email email;
	
	
	/**
	 * @return the phone
	 */
	public PhoneNumber getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}


	/**
	 * @return the mobile
	 */
	public PhoneNumber getMobile() {
		return mobile;
	}


	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(PhoneNumber mobile) {
		this.mobile = mobile;
	}


	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}


	public Contact() {
		// TODO Auto-generated constructor stub
	}
	

}
