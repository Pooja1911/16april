package com.cg.duplicate;

import java.util.Scanner;

import org.apache.log4j.Logger;


public class StringDuplicate {
	
	public static void main(String []args)
	
	{
		final  Logger LOGGER = Logger.getLogger(StringDuplicate.class.getName());
		LOGGER.info("Enter a String");
		final Scanner scan= new Scanner(System.in);
		 final String str=scan.next();
		 final char [] array=str.toCharArray();
		int count=0;
		final int length=str.length();
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				
		if(array[i]==array[j])
		{ count++;
			
		}}
		
		}
		
		if(count>0)
		{
			LOGGER.info("true");
		}
		else
		{
			LOGGER.info("false");
		}
		scan.close();
	}
	

}
