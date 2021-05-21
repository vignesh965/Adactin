package com.poclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	
	public  WebDriver driver;
	
	
	public Bookhotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
		
		}
	
	
	@FindBy(id="first_name")
	private WebElement firstname;
	


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getAddre() {
		return addre;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctyp() {
		return cctyp;
	}

	public WebElement getExpmnth() {
		return expmnth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBoknow() {
		return boknow;
	}

	@FindBy(id="last_name")
	private WebElement lstname;
	
	@FindBy(id="address")
	private WebElement addre;

	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement cctyp;

	@FindBy(id="cc_exp_month")
	private WebElement expmnth;

	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement boknow;

	

}
