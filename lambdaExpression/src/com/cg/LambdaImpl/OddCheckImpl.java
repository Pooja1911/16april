package com.cg.LambdaImpl;

import java.util.Scanner;

import com.cg.lambda.OddCheck;

public class OddCheckImpl {

	public static void main(String args[]) {

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		  int inputnum=scan.nextInt();
		OddCheck number = new OddCheck();
		number.setNumber(inputnum);

		// boolean isOdd = number.checkOddNumber(OddCheckImpl::isOdd);
		// System.out.println(isOdd);

		// boolean s=number.checkOddNumber(num -> isOdd(num));

		boolean value = number.checkOddNumber(num -> {

			boolean val = num % 2 == 0;
			if(val==true)
			{
				System.out.println("ODD");
			}
			else
			{
				System.out.println("EVEN");
			}
			return val;
		});
		

	}

	private static boolean isOdd(int num) {
		boolean bool = false;
		if (num % 2 == 0) {
			bool = false;
		} else {
			bool = true;
		}
		return bool;
	}

}
