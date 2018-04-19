/*
 * Program name:           to reverse string 
 * Program Description :   to reverse the string given 
 *                         by the user
 * Programmer Name :       Pooja jain
 * Date of Release :       16 april
 */

package testcases.reversetest;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
	final static Logger LOGGER = Logger.getLogger(ReverseString.class.getName());
	public static void main(String[] args) {
		//Applying logger
		

		LOGGER.info("Enter the String");
		final Scanner scan = new Scanner(System.in);
		final String str = scan.nextLine();
		String status=isReverseString(str);
		LOGGER.info(status);
		scan.close();
		
		}
		
		
	//method to reverse the string
    static String isReverseString(String string)
    {
    	final String array[] = string.split("");
		String finalStr = "";
		final int length = string.length();
		for (int i = length - 1; i >= 0; i--) {
			finalStr += array[i] + "";
			
    }
		return finalStr;
}
}
