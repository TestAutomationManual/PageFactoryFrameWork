package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goToHome() {
		
	}
	
	public void goToLeads() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][1]")).click();
	}
	
	public void goToContacts() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][2]")).click();
	}
	
	public void goToAcconts() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][3]")).click();
	}
	
	public void goToDeals() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][4]")).click();
	}
	
	public void goToActivities() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][5]")).click();
	}
	
	public void goToReports() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][6]")).click();
	}
	
	public void goToMarketplace() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][7]")).click();
	}
	
	public void signOut() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][7]")).click();
	}

}
