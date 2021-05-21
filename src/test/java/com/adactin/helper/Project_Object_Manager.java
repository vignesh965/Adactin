package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.poclass.Bookhotel;
import com.poclass.Bookingconfrm;
import com.poclass.Serachhotel;
import com.poclass.login;
import com.poclass.searchhotel2;

public class Project_Object_Manager {
	
	public  WebDriver driver;
	
	private login log;
	
	private Serachhotel serach;
	
	private searchhotel2 select;
	
	private Bookingconfrm book;
	
	private Bookhotel hotel;
	
	
	
  
	

public Project_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

public login getInstanceLogin() {

   log = new login(driver);

   return log;

}

     public Serachhotel getInstanceSearch() {
    	 
	 serach = new Serachhotel(driver);
	 
	 return serach;
	 
}
     
     public searchhotel2 getInstanceSelect() {
    	 
    	 select = new searchhotel2(driver);
    	 
    	 return select;
    	 
    	 
     }
     
    public Bookingconfrm getInstanceBook() {
		
    	book = new Bookingconfrm(driver);
    	
    	return book;
	}
    
    public Bookhotel getInstanceHotel() {
    	
    	hotel = new Bookhotel(driver);
    	
    	return hotel;
		

	}
  


}
