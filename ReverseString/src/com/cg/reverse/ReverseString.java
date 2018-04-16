package com.cg.reverse;

import java.util.Scanner;

public class ReverseString {
public static void main( String []args)
{
	System.out.println("Enter the String");
	Scanner scan= new Scanner(System.in);
	String str=scan.nextLine();

String array[]=str.split("");
String finalStr="";
 int  length=str.length();
for(int i =length-1 ; i>= 0 ;i--){
    finalStr += array[i]+"";
}
System.out.println(finalStr);
}



    }



