package bank.bankapplication;

import java.util.Date;

public class Statement {
	
	private Date date;
	private String content;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Statement() {
		// TODO Auto-generated constructor stub
	}
}
