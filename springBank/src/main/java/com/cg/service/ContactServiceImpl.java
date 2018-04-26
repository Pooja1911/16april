package com.cg.service;

import java.util.List;

import com.cg.model.Contact;
import com.cg.repository.IContactDao;

public class ContactServiceImpl implements IContactService  {
 public IContactDao contactDao;
 
	
public ContactServiceImpl() {
	// TODO Auto-generated constructor stub
}
	/**
	 * @param contactDao
	 */
	public ContactServiceImpl(IContactDao contactDao) {
		
		this.contactDao = contactDao;
	}
	public List<Contact> addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactDao.addContact(contact);
	}

}
