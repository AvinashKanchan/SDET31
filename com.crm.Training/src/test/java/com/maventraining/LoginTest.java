package com.maventraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
@Test
public void main() {
	String BROWSER=System.getProperty("BROWSER");
	String Url=System.getProperty("Url");
	String USERNAME=System.getProperty("USERNAME");
	String PASSWORD=System.getProperty("PASSWORD");
	
	WebDriver driver = null;
	
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		
	}
	else if(BROWSER.equalsIgnoreCase("firefox")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	else {
		System.out.println("specify a valid browser");
		
	}
	driver.get(Url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
   
	
}
}
