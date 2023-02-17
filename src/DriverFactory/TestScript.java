package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestScript {
	
	WebDriver driverobject;
	
	
	@BeforeTest
	public void setup() throws Throwable
	{
		driverobject = new ChromeDriver();
		driverobject.manage().window().maximize();
		driverobject.get("https://www.youtube.com/");
		Thread.sleep(3000);
		search.sendKeys("power of stocks");
		Thread.sleep(2000);
		searchbutton.click();
		Thread.sleep(2000);
		trending.click();
		Thread.sleep(2000);
		
	}
}
