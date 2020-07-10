package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.Page;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ZohoAppPage;


public class LoginTest{

	@Test
	public void loginTest() {
	HomePage hm= new HomePage();

	LoginPage pl=hm.goToSignIn();

	ZohoAppPage zp=pl.LoginIn("odinvas56@gmail.com","Admin@7890");		
	
}
}
