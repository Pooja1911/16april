package com.cg.duplicate;

import java.util.Scanner;

public class StringDuplicate {
	
	public static void main(String []args)
	
	{
		System.out.println("Enter a String");
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		char [] array=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				
		if(array[i]==array[j])
		{ count++;
			
		}}
		
		}
		
		if(count>0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
	

}
