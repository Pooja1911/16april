package com.cg.recognizeString;

import java.util.Scanner;

public class RecognizeString 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String:");
		Scanner scan=new Scanner(System.in);
		int cnt=0;
		String str="";
		String S=scan.next();
		char arr[]=S.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		  {
			if(arr[i]!=arr[i+1])
			  {
				System.out.println(S);
			 
			  }
			 break;
		  }
		  
		  for(int i=0;i<arr.length-1;i++)
		  {
			  
			  if(arr[i]==arr[i+1])
			  {
				 
				cnt++;
				continue;
			  }
			  else
			  {
				   
				  char temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
				  str=String.valueOf(arr);
			  }
		  }
		  if(cnt!=3)
		  {
				//  System.out.println(str.length());
				  for(int j=0;j<str.length()-1;j++)
				  { 
					 
					  if(str.charAt(j)==str.charAt(j+1))
					  {
						  System.out.println("null");
					  }
					  else
					  {
						  System.out.println("String is"+str);
						  break;
					  }
					  
				  }
				  
				  
		  }
		  else
		  {
			  System.out.println(str);
		  }
	  }
  }
		  
		  
	


