package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage{
	WebDriver driver=null;
	public CardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By checkout=By.xpath("//a[@class='btn_action checkout_button']");
	
	public void checkoutclick()
	{
		driver.findElement(checkout).click();
	}
     
}
