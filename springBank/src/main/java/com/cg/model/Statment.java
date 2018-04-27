package com.cg.model;

import java.util.Date;

public class Statment {
	
	private Date date;
	private String content;
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	 * @param date
	 * @param content
	 */
	public Statment( String content) {
		super();
		this.date = new Date();
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Statment [date=" + date + ", content=" + content + "]";
	}
	public Statment() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param date
	 * @param content
	 */
	public Statment(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

}
