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
		String[] headerColumns=dataFileReader.getHeader();
		assertNotNull(headerColumns);
		for(String header: headerColumns)
		{
			System.out.print(header+"   ");
		}
	}
	@Test
	public void testHeaderColumnCount()
	{
		int count=0;
		String [] headerColumns=dataFileReader.getHeader();
		for(String header: headerColumns)
		{
			count++;
		}
		System.out.println("\nColumn Count is : "+count);
		assertEquals(5, count);
	}
	@Test
	public void testHeaderColumnAvailability()
	{
		String [] headerColumns=dataFileReader.getHeader();
	    assertEquals(true, headerColumns[2].contains("City"));
	}

	

}
