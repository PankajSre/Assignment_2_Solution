package com.niit.datamunger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DataFileReader {

	BufferedReader bufferedReader;
	String fileName;

	public DataFileReader(String fileName) {
		this.fileName = fileName;
	}

	public String [] getHeader() {
		String [] header=null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			int i = 0;
			int size=columns.length;
			header=new String[size];
			for (String column : columns) {
			header[i]=column;
			i++;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return header;
	}

	public String[] getHeaderDataType() {
		
		return null;
	}

	public String[] getData() {
		
		String [] data=null;
		String line="";
		int i=0;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			bufferedReader.readLine();
			
			while((line=bufferedReader.readLine())!=null)
			{
			String columns[] = line.split(",");
			data= new String[columns.length];
			
				data[i]=columns.toString();
				i++;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return data;
	}
	
	public static boolean isNumeric(String column)
	{
		try
		{
			double number = Double.parseDouble(column);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
}
