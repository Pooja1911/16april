/*
 * Program name:           to reverse string 
 * Program Description :   to reverse the string given 
 *                         by the user
 * Programmer Name :       Pooja jain
 * Date of Release :       16 april
 */

package com.cg.reverse;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
	public static void main(String[] args) {
		//Applying logger
		final Logger LOGGER = Logger.getLogger(ReverseString.class.getName());

		LOGGER.info("Enter the String");
		final Scanner scan = new Scanner(System.in);
		final String str = scan.nextLine();

		final String array[] = str.split("");
		String finalStr = "";
		final int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			finalStr += array[i] + "";

		}
		LOGGER.info(finalStr);
		scan.close();
	}

}
