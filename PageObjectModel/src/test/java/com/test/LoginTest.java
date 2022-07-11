package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest {
	
   WebDriver driver;
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
        LoginPage lp = new LoginPage(driver);
        
        DashboardPage dp = lp.validLogin();
        
        UserPage up = dp.userClick(); 
}}