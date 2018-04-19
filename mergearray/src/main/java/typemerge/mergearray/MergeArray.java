package typemerge.mergearray;

import java.util.Scanner;
import java.util.logging.Logger;



public class MergeArray {
	final  static  Logger LOGGER = Logger.getLogger(MergeArray.class.getName());

	 final public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 final Scanner scan=new Scanner(System.in);
      LOGGER.info("Enter the size of array");
      final int num= scan.nextInt();
     LOGGER.info("Enter elements");
     Integer array[] = new Integer[num];
		for (int value = 0; value < num; value++) {
			array[value] = scan.nextInt();
		}
		 LOGGER.info("Enter the size of array");
	      final int num1= scan.nextInt();	
		String[] string = new String[num1];
		for (int value = 0; value < num1; value++) {
			string[value] = scan.nextLine();
		}
     
 
  printarray(array);
  printarray(string);
    
     
      
	}
     
	private static <E> void printarray(E[] input)
	{
		for(E array :input)
		{
			LOGGER.info("The List is"+array);
		}
	}
}
