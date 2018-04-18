package com.cg.LambdaImpl;

import java.util.Scanner;

import org.apache.log4j.Logger;


import com.cg.lambda.OddCheck;

public class OddCheckImpl {

	public static void main(String args[]) {
		final  Logger LOGGER = Logger.getLogger(OddCheckImpl.class.getName());
		LOGGER.info("Enter a number");
		 final Scanner scan = new Scanner(System.in);
		   final int inputnum=scan.nextInt();
		 final OddCheck number = new OddCheck();
		number.setNumber(inputnum);

		// boolean isOdd = number.checkOddNumber(OddCheckImpl::isOdd);
		// System.out.println(isOdd);

		// boolean s=number.checkOddNumber(num -> isOdd(num));

		boolean value = number.checkOddNumber(num -> {

			boolean val = num % 2 == 0;
			if(val==true)
			{
				LOGGER.info("ODD");
			}
			else
			{
				LOGGER.info("EVEN");
			}
			return val;
		});
		

	}

	

}
