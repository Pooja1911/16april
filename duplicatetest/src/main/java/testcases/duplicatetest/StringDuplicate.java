/*
 * Program name:           to reverse string 
 * Program Description :   to reverse the string given 
 *                         by the user
 * Programmer Name :       Pooja jain
 * Date of Release :       18 april
 */

package testcases.duplicatetest;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class StringDuplicate {

	//final  static Logger LOGGER = Logger.getLogger(StringDuplicate.class.getName());
	public static void main(String[] args)

	{
		
		System.out.println("Enter a String");
		final Scanner scan = new Scanner(System.in);
		final String str = scan.next();
		boolean value = isStringDuplicate(str);
		// checking for string duplication
		if (value == true) {
			System.out.println("String matched");
		} else {
			System.out.println("No match found");
		}
		scan.close();
	}
	// method to check string duplication

	static boolean isStringDuplicate(String string) {
		final char[] array = string.toCharArray();
		int count = 0;
		boolean bool = false;
		final int length = string.length();
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				if (array[i] == array[j]) {
					count++;
				}
			}

			if (count > 0) {
				bool = true;
			} else {
				bool = false;
			}
		}
		return bool;
	}

}
