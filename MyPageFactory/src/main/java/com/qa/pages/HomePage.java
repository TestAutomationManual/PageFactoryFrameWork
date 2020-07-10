package com.qa.pages;

import com.qa.base.Page;

public class HomePage extends Page{

	public LoginPage goToSignIn() {
		
		Page.click("loginlink_CSS");
		System.out.println("Click on Login link");
		return new LoginPage();
				
	}
	



}
