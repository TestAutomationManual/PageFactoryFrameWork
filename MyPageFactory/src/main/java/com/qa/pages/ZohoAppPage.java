package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.Page;
import com.qa.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	public void getAppName() {
	List<WebElement> list=driver.findElements(By.xpath("//div[@class='ea-app-container']/div"));
	int l= list.size();	
	for(int i=1; i<l; i++) 
	{
		String appName=driver.findElement(By.xpath("//div[@class='ea-app-container']/div["+i+"]")).getText();
		System.out.println("App name is "+appName);
		
	}
		
	}
	public CRMHomePage goToCRM() 
	{
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		return new CRMHomePage();
		
	}

}
