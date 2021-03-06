package com.cg.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class FileRead {
	final static Logger LOGGER = Logger.getLogger(FileRead.class.getName());
	//method to read a file
	private static void readfile()
	{
		
		try {
			final FileReader filereader=new FileReader("./readfile.txt");
		  
			try {
				int value=0;
				
				while(( value=filereader.read())!=-1)
				{
					System.out.println((char)value);//why not logger
					
				}
				filereader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				LOGGER.info("not able to read file"+e.getMessage());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.info("file does not exists"+e.getMessage());
		}
		
	}
	//method to write content of a file
	 private static void writefile()
	 {
		try {
			 final FileWriter filewriter=new FileWriter("./readfile.txt");
			filewriter.write("Welcome to India");
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			LOGGER.info("Exception occured"+e.getMessage());
		}
	 }
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final FileRead fileread=new FileRead();
		fileread.readfile();
		fileread.writefile();

	}

}
