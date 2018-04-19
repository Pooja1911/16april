/*
 * Program name:           to check Palindrome 
 * Program Description :   this program is to check
 *                         that given input is 
 *                         palindrome or not
 * Programmer Name :       Pooja jain
 * Date of Release :       16 april
 */

package testcases.palinTest;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Palindrome {
	final  static Logger LOGGER = Logger.getLogger(Palindrome.class.getName());
	public static void main(String []args) {
		// TODO Auto-generated method stub
		
		String value;

		LOGGER.info("Enter the value");
		final Scanner scan = new Scanner(System.in);
		value = scan.next();
		 boolean bool=isPalindrome(value);
		 if(bool==true)
		 {
			 LOGGER.info("Palindrome");
		 }
		 else
		 {
			 LOGGER.info("Not a Palindrome");
		 }
		scan.close();
	}
static boolean isPalindrome(final String palindrome)
{
	final StringBuilder input = new StringBuilder();
	// appending the user given value into StringBuilder object
	input.append(palindrome);
	// reversing the string
	final StringBuilder input1 = input.reverse();
	// checking for palindrome
	if(palindrome=="")
	{
		return false;
	}
	if (palindrome.equals(input1.toString())) {
	return (true);
	} else {
		return (false);
	}
}
}
