package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		
		String path="db.properties";
		FileReader reader = null;
		try {
			
			reader = new FileReader(path);
			Properties pro = new Properties();
			pro.load(reader);
			String url = pro.getProperty("name");
			String user = pro.getProperty("company");
			String password = pro.getProperty("gf");
			System.out.println("Name : "+url);
			System.out.println(" Company : "+ user );
			System.out.println(" gf : "+password);
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
