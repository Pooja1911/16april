package com.cg.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneBookImpl implements IPhonrBook{
  Scanner scan=new Scanner(System.in);
  List<Person> list=new ArrayList<Person>();
	@Override
	public List<Person> addPerson(Person person) {
		// TODO Auto-generated method stub
		
		 Person persons=new Person(person.getId(),person.getFirstName(),person.getLastName(),person.getPhoneNumber());
		 
		 list.add(persons);
		if(list.size()>0)
		{
			Collections.sort(list, new SortPhone());
		}
		return list;
	}

	@Override
	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
		
		list.remove(person);
		if(!(list.isEmpty()))
		{
		System.out.println("List is empty");
		}
		
		
		
	}

	@Override
	public List<Person> search(String firstName) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public void search(Long phoneNumber,Person person) {
		// TODO Auto-generated method stub
		
	     if(phoneNumber.equals(person.getPhoneNumber()))
	     {
           System.out.println("details are"+person);

	     }else
	     {
	    	 System.out.println("No match found");
	     }
		
	}

	@Override
	public void search(Integer id,Person person) {
		// TODO Auto-generated method stub
		 if(id.equals(person.getId()))
	     {
           System.out.println("details are"+person);

	     }else
	     {
	    	 System.out.println("No match found");
	     }
		
	}

}
