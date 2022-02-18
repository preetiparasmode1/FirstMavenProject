package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver dpdriver = null; 
	@FindBy(tagName="h1")
	WebElement header ;
	
	@FindBy(xpath="//li[3]/a")
	WebElement userBtn;
	
	public DashboardPage(WebDriver driver ) {
		this.dpdriver=driver;
		PageFactory.initElements(driver ,this);
	}
	
	public boolean verifyHeader() {
		return header.isDisplayed();
		
	}
	public UserPage userClick() {
		userBtn.click();
	return new UserPage(dpdriver);
	}
}
