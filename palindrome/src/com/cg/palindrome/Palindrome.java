/*
 * Program name:           to check Palindrome 
 * Program Description :   this program is to check
 *                         that given input is 
 *                         palindrome or not
 * Programmer Name :       Pooja jain
 * Date of Release :       16 april
 */

package com.cg.palindrome;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Palindrome {
	
	
	
	public static void main(String []args) {
		// TODO Auto-generated method stub
		final  Logger LOGGER = Logger.getLogger(Palindrome.class.getName());
		String value;

		LOGGER.info("Enter the value");
		final Scanner scan = new Scanner(System.in);
		value = scan.next();
		final StringBuilder input = new StringBuilder();
		// appending the user given value into StringBuilder object
		input.append(value);
		// reversing the string
		final StringBuilder input1 = input.reverse();
		// checking for palindrome
		if (value.equals(input1.toString())) {
		LOGGER.info("Palindrome Number");
		} else {
			LOGGER.info("Not a palindrome");
		}
		scan.close();
	}

}
