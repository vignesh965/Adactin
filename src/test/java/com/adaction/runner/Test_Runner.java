package com.adaction.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader_Manager;
import com.poclass.Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adaction//feature",glue = "com.adaction.stepdefinition",
monochrome = true,
dryRun=false,
strict=true,
plugin= {"pretty","html:Report/Html_Report","json:Reports/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
		}


)


public class Test_Runner {
	

	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		

		
		driver = Base_class.browserLaunch(File_Reader_Manager.getinstance().getinstanceCR().getBrowser());
		

	}
	
	@AfterClass
	public static void tearDown() {
		
		driver.close();
		
		
	

	}
	

	
}
