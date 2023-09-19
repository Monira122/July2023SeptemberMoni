package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiredtLocators {
	WebDriver driver;
	@BeforeTest
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void idLocatorsTest() {
		driver.findElement(By.id("email")).sendKeys("moni");
	}
	@Test
	public void nameLocatorsTest() {
		driver.findElement(By.name("pass")).sendKeys("ghhg");
		
	}
	@Test
	public void linkTextLocatorsTest() {
		driver.findElement(By.linkText("Forgot Password?")).click();
	}
	@Test
	public void partioallinkTextLocatorsTest() {
		
	//if link text is too big 
		//if link text has space in between
		//if link text has number in between
		//then is better use partial link text 
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
}
}
