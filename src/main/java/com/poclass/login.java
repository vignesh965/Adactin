package com.poclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class login {

	public  WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usrname;
	


	

	public login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getLog() {
		return log;
	}

	@FindBy(id="password")
	private WebElement passwrd;
	
	@FindBy(id="login")
	private WebElement log;
	
	
}
