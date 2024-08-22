package com.SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver=null;
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By title=By.xpath("//div[@class='product_label']");
	public String gettitle()
	{
		return driver.findElement(title).getText();
		
	}
	

}
