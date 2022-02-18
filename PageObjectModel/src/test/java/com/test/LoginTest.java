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
	WebDriver driver = null;
	LoginPage lp=null;
	DashboardPage  dp=null;
	UserPage up = null;
	@BeforeSuite
	// @Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		lp =new LoginPage(driver);
		//lp.loginToApp("kiran@gmail.com", "123456");
		//Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void verifyHeader() {
		dp=lp.validLogin();

		boolean b=dp.verifyHeader();
		//dp.userClick();
		Assert.assertTrue(b);
	}
	@Test
	public void verifyUserClick() {
		up=dp.userClick();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}

}
