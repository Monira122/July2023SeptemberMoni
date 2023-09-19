package com.facebook.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DircetLocators2 {
   WebDriver driver;
   @BeforeTest
   public void openFacebook() {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.facebook.com/");
}
   @Test
   public void idLocators() {
	   driver.findElement(By.id("email")).sendKeys("hilll");  
   }
   @Test
   public void nameLocators() {
	   driver.findElement(By.name("pass")).sendKeys("ghhh");
   }
   @Test
   public void linkTestLocators() {
	   driver.findElement(By.linkText("Forgot password?")).click();
   }
   public void partioallinkTextLocatorsTest() {
	   driver.navigate().back();
	   driver.findElement(By.partialLinkText("Forgot")).click();
   }
}