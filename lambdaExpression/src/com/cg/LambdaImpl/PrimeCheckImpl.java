package com.cg.LambdaImpl;

import java.util.Scanner;

import com.cg.lambda.OddCheck;

public class PrimeCheckImpl {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		OddCheck number = new OddCheck();
		number.setNumber(num1);
		boolean isprime = number.checkPrimeNumber(PrimeCheckImpl::isPrime);
		

	}

	private static boolean isPrime(int num) {
		boolean bool = false;
		int cnt = 0;
		if (num == 0 || num == 1) {
			System.out.println("neither prime nor composite");
			bool = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % 2 == 0) {
					cnt++;
				}
			}

			if (cnt == 0) {
				System.out.println("PRIME");
				bool = true;
			} else {

				System.out.println("COMPOSITE");
				bool = false;
			}

		}
		return bool;
	}

}
