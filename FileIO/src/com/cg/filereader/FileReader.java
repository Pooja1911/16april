package com.cg.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class FileReader {
	final static Logger LOGGER = Logger.getLogger(FileReader.class.getName());
	//method to read a file
	private void readfile()
	{
		

		File files=new File("./readfile.txt");
		FileInputStream fileInputStream=null;
		 try {
			fileInputStream=new FileInputStream(files);
			int value=0;
			try {
				value=fileInputStream.read();
				while(value!=-1)
				{
					LOGGER.info("Data is"+(char)value);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				LOGGER.info("exception occured"+e.getMessage());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.info("fine not found"+e.getMessage());
			
		}
		
	}
	//method to write content of a file
	 private void writefile()
	 {
		 File newfile=new File("./writefile.txt");
		 FileOutputStream fileoutputstream1=null;
		try {
			fileoutputstream1 = new FileOutputStream(newfile);
			FilterOutputStream filteroutputstream = new FilterOutputStream(fileoutputstream1);
		 
			String writes="Welcome to capgemini";
			byte readBytes[]=writes.getBytes();
			try {
				filteroutputstream.write(readBytes);
				filteroutputstream.flush();
				filteroutputstream.close();
				fileoutputstream1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				LOGGER.info("some exception has occured"+e.getMessage());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			LOGGER.info("file does not found"+e.getMessage());
		}
	 }
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
