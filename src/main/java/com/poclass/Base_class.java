package com.poclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Response.OutputType;

import Selenium.org.Browserlaunch;
import net.bytebuddy.asm.Advice.Return;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String s) {
		if (s.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
					"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (s.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".geckodriver.exe");
			 driver = new FirefoxDriver();

		} else {
			System.out.println("invalid browser");
		}
		
		return driver;

	}
	
	//CLICK
	
	public static void clickOnElement(WebElement element) {
		
		try {
		element.click();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	//SENDKEYS
	
	public static void inputText(WebElement element,String inputvalue) {
		element.sendKeys(inputvalue);
		}
	
	//IS ENABLED
	
	public static void isEnabled(WebElement element) {
		element.isEnabled();
}
	
	
	
	// CLOSE
	public static void close() {
		driver.close();
	}

	// QUIT
	public static void quit() {
		driver.quit();
	}

//NAVIGATE

	public static void navigateto(String Url) {
		driver.navigate().to(Url);
	}
	
	
public static void navigateback() {
	driver.navigate().back();

}

public static void navigateforward() {
driver.navigate().forward();

}


public static void navigaterefresh() {
	driver.navigate().refresh();
	
}

//GET
	public static void geturl(String URL) {
		driver.get(URL);
	}
	
	public static void gettitle() {
	driver.getTitle();
	}
	
	
	
	public static void getAttribute(By bySearchButton) {
		WebElement element = driver.findElement(bySearchButton);
		System.out.println(element);
	
	}
	
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
		}
	
	
	//DROPDOWN
	
	public static void dropdownSelect(WebElement element, String value, String type) {
		try {
			Select sc = new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
				sc.selectByValue(value);
			} else if (type.equalsIgnoreCase("byvisibletext")) {
				sc.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
		//SIMPLEALERT
	public static void simplealert() {
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		}
	
	//CNFRM ALERT
	
	public static void confirmalert() {
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
	}
	
	//PROMPTALERT
	public static void promptalert() {
		Alert promptalert = driver.switchTo().alert();
		promptalert.accept();
	}
	
	//SCREENSHOT
	
	public static void takesscreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
	
	//IMPLICITWAIT
	
	public static void implicitwait(int s) {
		
		driver.manage().timeouts().implicitlyWait(s,TimeUnit.SECONDS);
		
	}
	
	//ROBOT
	
	
	public static void robot(String s) throws AWTException {
Robot r = new Robot();
if (s.equalsIgnoreCase("down")) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	}

else if (s.equalsIgnoreCase("up")) {
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	}

else if (s.equalsIgnoreCase("enter")) {
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}

	}
		

	//ACTIONS
	
	public static void actions(String s,WebElement element) {
	Actions ac = new Actions(driver);
	
	if (s.equalsIgnoreCase("contextclick")) {
		ac.contextClick(element).build().perform();
		}
	else if (s.equalsIgnoreCase("click")){
		ac.click(element).build().perform();
			}
	else if (s.equalsIgnoreCase("movetoelement")) {
		ac.moveToElement(element).build().perform();
		}
	}
	
	
	public static void frame(int s) {
		
		driver.switchTo().frame(s);
		
	}

}






