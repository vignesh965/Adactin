package com.poclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfrm {
	
	public static WebDriver driver;
	
	public Bookingconfrm(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(id="my_itinerary")
	private  WebElement myitiner;
	
	public WebElement getMyitiner() {
		return myitiner;
	}

	public WebElement getLogut() {
		return logut;
	}

	@FindBy(id="logout")
	private WebElement logut;
	
	

	
}
