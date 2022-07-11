package com.stepdept;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
                
	WebDriver driver;
        @Before
        public void setUp() {
        	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    driver= new ChromeDriver();
        }
        @After
        public void tearDown() {
        	driver.close();
        }
		@Given("^user should be on login page$")
		public void user_should_be_on_login_page() throws Throwable {
		    
		    driver.get("file:///D:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		}

		@When("^user enter valid credentials$")
		public void user_enter_valid_credentials() throws Throwable {
		    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		    driver.findElement(By.id("password")).sendKeys("123456");
		    driver.findElement(By.xpath("//button")).click();
		}

		@Then("^user should be on homepage$")
		public void user_should_be_on_homepage() throws Throwable {
		  Assert.assertEquals("JavaByKiran | Dashboard",driver.getTitle()) ;
		}
		@Then("^user should verify header$")
		public void user_should_verify_header() throws Throwable {
		  
		  Assert.assertTrue( driver.findElement(By.tagName("h1")).isDisplayed());
		}
}
