package bank.bankapplication;

import java.util.Date;

/**
 * @author trainee
 *
 */
public class Statement {
	
	private Date date;
	private String content;
	public Date getDate() {
		return date;
	}
	

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}


	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	public Statement() {
		// TODO Auto-generated constructor stub
	}
}
