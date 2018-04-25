package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Contact;

public class ContactDaoImpl implements IContactDao{

	public List<Contact> addContact(Contact contact) {
		// TODO Auto-generated method stub
		List<Contact> list=new ArrayList<Contact>();
		list.add(contact);
		return list;
	}

}
