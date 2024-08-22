package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver=null;
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By btn=By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
	By btn1=By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");
	public void AddToCard() 
	{
		driver.findElement(btn).click();
	}
	public void YourCard() 
	{
		driver.findElement(btn1).click();
	}
	

	

}
