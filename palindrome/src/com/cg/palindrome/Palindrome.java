package com.cg.palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String value;

	System.out.println("Enter the value");
	Scanner scan=new Scanner(System.in);
	value=scan.next();
	StringBuilder input=new StringBuilder();
	//appending the user given value into StringBuilder object
	 input.append(value);
	 //reversing the string
	StringBuilder input1=input.reverse();
	//checking for palindrome
	if(value.equals(input1.toString()))
	{
		System.out.println("Palindrome Number");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}
}
