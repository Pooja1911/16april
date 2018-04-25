package com.cg.repository;

import java.util.List;

import com.cg.model.Contact;


public interface IContactDao {
	public List<Contact> addContact(Contact contact);

}
