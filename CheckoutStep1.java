package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStep1 {
	WebDriver driver=null;
	public CheckoutStep1(WebDriver driver) {
		this.driver=driver;
	}
	By firstname=By.id("first-name");
	By lastname=By.id("last-name");
	By postalcode=By.id("postal-code");
	By continuebtn=By.xpath("//input[@value='CONTINUE']");
	
	public void setFirstName(String Fname) {
		driver.findElement(firstname).sendKeys(Fname);
	}
	public void setLastName(String Lname)
	{
		driver.findElement(lastname).sendKeys(Lname);
	}
	public void setPostalCode(String code) {
		driver.findElement(postalcode).sendKeys(code);
	}
	public void ContinueClick()
	{
		driver.findElement(continuebtn).click();
	}
	
	

}
