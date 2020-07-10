package com.qa.pages.crm.accounts;

import org.openqa.selenium.By;

import com.qa.base.Page;

public class AccountsPage extends Page
{
	public CreateAccountsPage goToCreateAcc() {
	
		driver.findElement(By.xpath("//lyte-tr[@id='table_row_1']/lyte-td[2]/span/link-to/button")).click();
		System.out.println("Click on Create account link");
		return new CreateAccountsPage();
	}
	
	public void goToImportAcc() {
		
		driver.findElement(By.xpath("//lyte-tr[@id='table_row_1']/lyte-td[2]/span/lyte-button")).click();
		
	}

}
