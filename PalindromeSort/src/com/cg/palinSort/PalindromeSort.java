package com.cg.palinSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PalindromeSort  {
	public static void main(String [] args)
	{
	
		System.out.println("enter string");

        String []array= new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
        	array[i]=sc.nextLine();
        	
        }
                                               
        for(String s:array)
        {
        	StringBuilder input=new StringBuilder();
        	 input.append(s);
        	StringBuilder input1=input.reverse();
                                                  	
        	if(s.equals(input1.toString()))
        	{       
             List<String> list =new ArrayList<String>();
             list.add(s);
             System.out.println(list);
             Iterator iterator=list.iterator();
             while(iterator.hasNext())
             {
            	 
             String []newarray=list.toArray(new String[0]);
             for(int i=0;i>newarray.length;i++)
             {
            	 int count1=newarray[i].length();
            	 int count2=newarray[i+1].length();
            	 if(count1>count2)
            	 {
            		 System.out.println(newarray[i]);
            	 }
            	 else
            	 {
            		 System.out.println(newarray[i+1]);
            	 }
             }
        		
        		
        		
                
        		
        	
             }
        }


	}

	}
}



