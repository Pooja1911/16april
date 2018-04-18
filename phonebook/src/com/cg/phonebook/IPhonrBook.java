package com.cg.phonebook;

import java.util.List;

public interface IPhonrBook {
	
	public List<Person> addPerson(Person person);
	public void deletePerson(Person person);
	public List<Person> search(String firstName);
	public void search(Long phoneNumber,Person person);
	public void search(Integer id,Person person);

}
