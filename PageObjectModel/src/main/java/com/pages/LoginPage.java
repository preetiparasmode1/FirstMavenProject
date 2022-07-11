package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver lpdriver;


public LoginPage(WebDriver driver) {
	this.lpdriver=driver;
	PageFactory.initElements(driver,this);
}
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	@FindBy(partialLinkText = "RegisterPage")
	WebElement link;
	
	public void loginToApp(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		
	}
	public DashboardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		return new DashboardPage(lpdriver);
	}
	
	public RegisterPage clickRegister() {
		link.click();
	
	  return new RegisterPage();

}
}

	

