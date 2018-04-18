package com.cg.lambda;

import com.cg.ILambda.Odd;
import com.cg.ILambda.Palindrome;
import com.cg.ILambda.Prime;

public class OddCheck {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public OddCheck() {
		// TODO Auto-generated constructor stub
	}

	public boolean checkOddNumber(Odd number)
	{
		return number.isOdd(this.number);
		
	}
	public boolean checkPrimeNumber(Prime prime)
	{
		 return prime.isPrime(this.number);
	}
	public boolean checkPalindrome(Palindrome palin)
	{
		return palin.isPalindrome(this.number);
	}
}
