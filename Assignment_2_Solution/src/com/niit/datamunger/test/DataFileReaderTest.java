package com.niit.datamunger.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.niit.datamunger.DataFileReader;

public class DataFileReaderTest {

	private static DataFileReader dataFileReader;
	
	@BeforeClass
	public static void init()
	{
		dataFileReader= new DataFileReader("C:/Scala/emp.csv");			
	}
	
	@Test
	public void testHeaderColumns()
	{
		Map<String, Integer> headerColumns=dataFileReader.getHeader();
		assertNotNull(headerColumns);
		for(Map.Entry<String, Integer> header: headerColumns.entrySet())
		{
			System.out.print(header.getKey()+"   ");
		}
	}
	@Test
	public void testHeaderColumnCount()
	{
		int count=0;
		Map<String, Integer> headerColumns=dataFileReader.getHeader();
		for(Map.Entry<String, Integer> header: headerColumns.entrySet())
		{
			count++;
		}
		System.out.println("\nColumn Count is : "+count);
		assertEquals(5, count);
	}
	@Test
	public void testHeaderColumnAvailability()
	{
		Map<String, Integer> headerColumns=dataFileReader.getHeader();
	    assertEquals(true, headerColumns.containsKey("Salary"));
	}

	

}
