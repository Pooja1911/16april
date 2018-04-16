package com.cg.palinSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PalindromeSort {
	public static void main(String [] args)
	{
		HashMap<String,Integer> map = new HashMap();
		System.out.println("enter string");

        String []array= new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
        	array[i]=sc.nextLine();
        	
        }
        // converting string array to string 
        for(String s:array)
        {
        	StringBuilder input=new StringBuilder();
        	 input.append(s);
        	StringBuilder input1=input.reverse();
        	//checking for palindrome
        	if(s.equals(input1.toString()))
        	{ //setting keys and values
        		map.put(s,s.length());
        		System.out.println(map);
        		
        		
                
        		
        	}
       
        }


	}


}
