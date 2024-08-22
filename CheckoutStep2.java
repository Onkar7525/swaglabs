package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStep2 {
	WebDriver driver=null;
	public CheckoutStep2(WebDriver driver) {
		this.driver=driver;
	}
	By finishbtn=By.xpath("//a[@class='btn_action cart_button']");
	By msg=By.xpath("//h2[@class='complete-header']");
	public void finishClick()
	{
		driver.findElement(finishbtn).click();
	}
	public String getmessage() {
		String message = this.driver.findElement(msg).getText();
		return message;
	}

}
