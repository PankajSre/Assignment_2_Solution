package com.niit.datamunger;

import java.util.Map;

public class DataMunger {

	public static void main(String[] args) {
		
		DataFileReader dataFileReader= new DataFileReader("C:/Scala/emp.csv");
		String [] header = dataFileReader.getHeader();
		
		for(String head : header)
		{
			System.out.print(head+" ");
		}
		System.out.println("");
		
		
		
	}
}
