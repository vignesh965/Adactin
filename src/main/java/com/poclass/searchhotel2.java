package com.poclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotel2 {
	
	public static WebDriver driver;
	
	public searchhotel2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(id="radiobutton_0")
	private WebElement checkbox;
	
	

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	@FindBy(id="continue")
	private WebElement continuee;
	
	}
