package com.qa.pages;

import com.qa.base.Page;

public class LoginPage extends Page {


	
	public ZohoAppPage LoginIn(String UserName, String Password) {
		
		type("email_CSS",UserName );
		type("password_CSS",Password);
		click("signbtn_CSS");

		return new ZohoAppPage();
	}
}
