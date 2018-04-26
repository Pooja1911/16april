package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Contact;

public class ContactDaoImpl implements IContactDao{
	List<Contact> list;
	public List<Contact> addContact(Contact contact) {
		// TODO Auto-generated method stub
		if(list.isEmpty())
		{
		 list=new ArrayList<Contact>();
		}
		else
		{
		list.add(contact);
		}
		return list;
	}

}
