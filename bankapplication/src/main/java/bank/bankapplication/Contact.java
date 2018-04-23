
package bank.bankapplication;

/**
 * @author pooja project name: Bank Application project Description : Contact
 *         class which include all details for contact as well as address
 *
 */
public class Contact extends Address {
	private long phone;
	private long mobile;
	private String email;
	Address address = null;// address reference

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact(long phone, long mobile, String email, Address address) {
		super();
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", mobile=" + mobile + ", email=" + email + ", address=" + address + "]";
	}

}
