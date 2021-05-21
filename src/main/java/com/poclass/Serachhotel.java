package com.poclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Serachhotel {
	
	public  WebDriver driver;
	
	public Serachhotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
		}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(name="location")
	private WebElement location;
	


	@FindBy(name="hotels")
	private WebElement hotels; 
	
	@FindBy(name = "room_type")
	private WebElement roomtype;
	
	@FindBy(name = "room_nos")
	private WebElement roomno;
	
	@FindBy(name = "datepick_in")
	private WebElement datepickin;
	
	@FindBy(name = "datepick_out")
	private WebElement datepickout;

	@FindBy(name="adult_room")
	 private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;

	
	
	
	
	
	
	
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(id="Submit")
	private WebElement search;


	



}

