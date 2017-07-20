package com.niit.datamunger;

import java.util.Map;

public class DataMunger {

	public static void main(String[] args) {
		
		DataFileReader dataFileReader= new DataFileReader("C:/Scala/emp.csv");
		Map<String, Integer> map = dataFileReader.getHeader();
		Map<String, String> dataType=dataFileReader.getHeaderDataType();
		for(Map.Entry<String, Integer> myMap : map.entrySet())
		{
			System.out.print(myMap.getKey()+" ");
		}
		System.out.println("");
		for(Map.Entry<String, String> data : dataType.entrySet())
		{
			System.out.println(data.getKey()+"---> "+data.getValue());
		}
		
	}
}
