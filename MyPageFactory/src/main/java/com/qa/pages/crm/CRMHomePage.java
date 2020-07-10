package com.qa.pages.crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.Page;
import com.qa.pages.crm.accounts.AccountsPage;

public class CRMHomePage extends Page{
	
	public void getTopMenu() {
		List<WebElement> list= driver.findElements(By.xpath("//div[@class=' lyteItem']"));
		
		for(int i=1; i<=list.size(); i++) {
			String Menu= driver.findElement(By.xpath("//div[@class=' lyteItem']["+i+"]")).getText();
			System.out.println("Menue "+i+" "+Menu);
		}

	}
	public AccountsPage goToAccountsPage() {
		driver.findElement(By.xpath("//div[@class=' lyteItem'][4]")).click();
		return new AccountsPage();
		
	}

}
