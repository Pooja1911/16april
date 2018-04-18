package com.cg.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****PERSON DETAILS******");
		System.out.println("1. Add data");
		System.out.println("2. Remove Data");
		System.out.println("3 . Search by name");
		System.out.println("4 . Search by phonenumber");
		System.out.println("5 . Search by id");
		System.out.println("6 . Exit");
		List<Person> per=new ArrayList<Person>();
		IPhonrBook phonebook=new PhoneBookImpl();
		Person person=new Person();
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Enter your First Name");
			String firstName=scan.next();
			person.setFirstName(firstName);
			System.out.println("Enter your Last Name" );
			String lastName=scan.next();
			person.setLastName(lastName);
			System.out.println("Enter your Id");
			int id=scan.nextInt();
			person.setId(id);
			System.out.println("Enter your phone number");
			long phone=scan.nextLong();
			person.setPhoneNumber(phone);
		           per= phonebook.addPerson(person);
		          System.out.println(per);
			    break;
		case 2:
			
			   System.out.println("Enter your first name");
			   String fname=scan.next();
			   if(fname.equals(person.getFirstName()))
			   {
				   System.out.println(person.getFirstName());
				   phonebook.deletePerson(person);
			   }
			    
			    break;
		case 3 :
	            System.out.println("Enter your first name");
	            String name=scan.next();
	            if(name.equals(person.getFirstName()))
	            {
	            	for(Person persons:per)
	            	{
	            		if(persons.getFirstName().contains(name))
	            		{
	            		System.out.println("The details are"+per);
	            		}
	            		else
	            		{
	            			System.out.println("No details");
	            		}
	            	}
	            }
	            
     			
			  break;
			  
		case 4 :
			System.out.println("Enter your phone number");
		     Long phoneno=scan.nextLong();
			     phonebook.search(phoneno,person);
			 
			     
			    break;
			    
		case 5 : 
			System.out.println("Enter your id");
		     Integer personId=scan.nextInt();
			     phonebook.search(personId,person);

			    break;
			  
		case 6: 
			System.out.println("BYE");
			System.exit(0);
			
			break;
		}
		}

	}

}
