package com.adaction.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.adactin.helper.Project_Object_Manager;
import com.adaction.runner.Test_Runner;
import com.poclass.Base_class;
import com.poclass.Bookhotel;
import com.poclass.Bookingconfrm;
import com.poclass.Serachhotel;
import com.poclass.login;
import com.poclass.searchhotel2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_class {
	
	public static WebDriver driver = Test_Runner.driver;
	
	//public static login log = new login(driver);
	
	public static Project_Object_Manager pom = new Project_Object_Manager(driver);
	
	//public static Serachhotel serach=new Serachhotel(driver);
	
	//public static searchhotel2 search=new searchhotel2(driver);
	
	//public static Bookhotel hotel=new Bookhotel(driver);
	
	//public static Bookingconfrm book=new Bookingconfrm(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		geturl("https://adactinhotelapp.com/");
	   
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		//inputText(log.getUsrname(), "vigneshb");
		
		inputText(pom.getInstanceLogin().getUsrname(), "vigneshb");
		
	
	 
	}

	@When("^user Enter The Password Field$")
	public void user_Enter_The_Password_Field() throws Throwable {
		
		//inputText(log.getPasswrd(), "Vicky@1995");
		
		inputText(pom.getInstanceLogin().getPasswrd(), "Vicky@1995");
	    
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		//clickOnElement(log.getLog());
		
		clickOnElement(pom.getInstanceLogin().getLog());
		
		Thread.sleep(10000);
	  
	}
	
	
	
	
    @When("^user Enter The Location$")
	public void user_Enter_The_Location() throws Throwable {
		
		
		
		//dropdownSelect(serach.getLocation(), "byvisibletext","Melbourne");
		
		Select sc = new Select(pom.getInstanceSearch().getLocation());
		sc.selectByVisibleText("Melbourne");
		
	    
	    
	}

	@When("^user Enter The Hotel$")
	public void user_Enter_The_Hotel() throws Throwable {
		//dropdownSelect(serach.getHotels(), "byvisibletext","Hotel Sunshine" );
		
		Select sc = new Select(pom.getInstanceSearch().getHotels());
		sc.selectByVisibleText("Hotel Sunshine");
		
	}

	@When("^user Enter The Room Type$")
	public void user_Enter_The_Room_Type() throws Throwable {
		//dropdownSelect(serach.getRoomtype(), "byvisibletext", "Double");
		
		
		Select sc = new Select(pom.getInstanceSearch().getRoomtype());
		sc.selectByVisibleText("Double");
		
	}
	
	@When("^user Enter The Number Of Rooms$")
	public void user_Enter_The_Number_Of_Rooms() throws Throwable {
		//dropdownSelect(serach.getRoom_nos(), "byindex", "2");
		
		Select sc = new Select(pom.getInstanceSearch().getRoomno());
		sc.selectByValue("2");
	    }

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		//dropdownSelect(serach.getCheckinhotel(), "byindex", "21/05/2021");
		
	inputText(pom.getInstanceSearch().getDatepickin(), "21/05/2021");
		
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		//dropdownSelect(serach.getDatepickout(), "byindex", "22/05/2021");
		
		inputText(pom.getInstanceSearch().getDatepickout(), "22/05/2021");
		
	}

	@When("^user Enter The Adults Per Room$")
	public void user_Enter_The_Adults_Per_Room() throws Throwable {
		//dropdownSelect(serach.getAdultroom(), "byindex", "2");
		
		inputText(pom.getInstanceSearch().getAdultroom(), "2");
	    
	}

	@When("^user Enter The Children Per Room$")
	public void user_Enter_The_Children_Per_Room() throws Throwable {
		
		//dropdownSelect(serach.getChildroom(), "byindex", "1");
		
		
		inputText(pom.getInstanceSearch().getChildroom(), "1");
	    
	}

	@Then("^user Click On Search Button And It Navigates To Select Hotel$")
	public void user_Click_On_Search_Button_And_It_Navigates_To_Select_Hotel() throws Throwable {
		
		clickOnElement(pom.getInstanceSearch().getSearch());
	    
	}

	@When("^user Select The Pick The Button$")
	public void user_Select_The_Pick_The_Button() throws Throwable {
	    	
		clickOnElement(pom.getInstanceSelect().getCheckbox());
	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	    
		clickOnElement(pom.getInstanceSelect().getContinuee());
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		
		inputText(pom.getInstanceHotel().getFirstname(), "Vignesh");
		
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		
		inputText(pom.getInstanceHotel().getLstname(), "baskaran");
	   
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
	     inputText(pom.getInstanceHotel().getAddre(), "345 sydney road");
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		
		inputText(pom.getInstanceHotel().getCc(), "1234567891234567");
	   
	}

	@When("^user Select The Drop Down Credit Card Type$")
	public void user_Select_The_Drop_Down_Credit_Card_Type() throws Throwable {
	    
		Select sc = new Select(pom.getInstanceHotel().getCctyp());
		sc.selectByVisibleText("VISA");
	}

	@When("^user Select The Drop Down Expiry Month$")
	public void user_Select_The_Drop_Down_Expiry_Month() throws Throwable {
	       
		Select sc = new Select(pom.getInstanceHotel().getExpmnth());
		sc.selectByVisibleText("March");
	}

	@When("^user Select The Drop Down Expiry Year$")
	public void user_Select_The_Drop_Down_Expiry_Year() throws Throwable {
	    
		
		Select sc = new Select(pom.getInstanceHotel().getExpyear());
		sc.selectByValue("2022");
	}

	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		
		inputText(pom.getInstanceHotel().getCvv(), "2345");
	    
	}

	@Then("^user Click On The Book Now Button And It Navigates To Booked Itineracy$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booked_Itineracy() throws Throwable {
	    
		clickOnElement(pom.getInstanceHotel().getBoknow());
		Thread.sleep(5000);
		
	}
	
	
	
	@When("^user Click The My Itineracy$")
	public void user_Click_The_My_Itineracy() throws Throwable {
		
	clickOnElement(pom.getInstanceBook().getMyitiner());	
	
}
	


@When("^user Click The Logoff$")
public void user_Click_The_Logoff() throws Throwable {

	clickOnElement(pom.getInstanceBook().getLogut());
	
}

}




























	
	
