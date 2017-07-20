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

	public Map<String, Integer> getHeader() {
		Map<String, Integer> header = new LinkedHashMap<>();
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			int i = 0;
			for (String column : columns) {
				header.put(column, i);
				i++;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return header;
	}

	public Map<String, String> getHeaderDataType() {

		Map<String, String> headerDataType = new LinkedHashMap<>();
		try {

			bufferedReader = new BufferedReader(new FileReader(fileName));
			bufferedReader.readLine();
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			for (String column : columns) {
				if (Pattern.matches("\\D+", column)) {
					headerDataType.put(column, "String");
				} else {
					headerDataType.put(column, "Number");
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return headerDataType;
	}

	public Map<Integer, String> getData() {
		
		Map<Integer, String> rowData= new LinkedHashMap<>();
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			bufferedReader.readLine();
			String line = bufferedReader.readLine();
			String columns[] = line.split(",");
			for (String column : columns) {
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
}
