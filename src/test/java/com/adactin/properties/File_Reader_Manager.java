package com.adactin.properties;

import com.adactin.helper.Configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
	
	
	public static File_Reader_Manager getinstance() {
		
		File_Reader_Manager helper = new File_Reader_Manager();
		
		return helper;
		
		
		
	}
	
	
	
	public Configuration_Reader getinstanceCR() throws Throwable {
		
		
		Configuration_Reader reader = new Configuration_Reader();
		
		return reader;
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
