package com.cg.LambdaImpl;

import java.util.Scanner;

import com.cg.lambda.OddCheck;

public class PalindromeCheckImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		OddCheck number = new OddCheck();
		number.setNumber(num1);

		boolean ispalindrome = number.checkPalindrome(PalindromeCheckImpl::isPalindrome);
		
		
	}

	private static boolean isPalindrome(int num) {

		int reminder = 0;
		boolean b = false;
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			reminder = temp % 10; // getting remainder
			sum = (sum * 10) + reminder;
			temp = temp / 10;

		}

		if (num == sum) {
			System.out.println("PALINDROME");
			return true;
		} else {
			System.out.println("NOT A PALINDROME");
			return false;
		}

	}

}
