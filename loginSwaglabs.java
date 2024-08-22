package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginSwaglabs {
	WebDriver driver=null;
	public loginSwaglabs(WebDriver driver) {
		this.driver=driver;
		
	}
	//locators
	By username=By.name("user-name");
	By password=By.name("password");
	By LoginButton=By.id("login-button");
	public void setUserName(String name) {
		driver.findElement(username).sendKeys(name);
		
	}
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void ClickLogin() {
		driver.findElement(LoginButton).click();
	}
	

}
