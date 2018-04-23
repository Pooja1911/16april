package bank.bankapplication;

public class Money {
	float bal;

	/**
	 * @return the bal
	 */
	public float getBal() {
		return bal;
	}

	/**
	 * @param bal the bal to set
	 */
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Money [bal=" + bal + "]";
	}

	public Money() {
		// TODO Auto-generated constructor stub
	}

}
