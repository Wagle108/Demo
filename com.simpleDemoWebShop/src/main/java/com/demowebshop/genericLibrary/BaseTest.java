package com.demowebshop.genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends dropdown {
public WebDriver driver;
@BeforeMethod
public void browserSetup() throws IOException {
	if(getPropertyValue("browser").equals("chrome")) {
	 driver = new ChromeDriver();
	}else if (getPropertyValue("browser").equals("firefox")) {
		driver=new FirefoxDriver();
		
	}
	driver.get(getPropertyValue("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterClass
public void browserSetDown() {
	driver.quit();
}


}
