package com.qa.rough;


import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ZohoAppPage;
import com.qa.pages.crm.CRMHomePage;
import com.qa.pages.crm.accounts.AccountsPage;
import com.qa.pages.crm.accounts.CreateAccountsPage;

public class LoginTest{

	
	public static void main(String[] args) {
		
		HomePage hm= new HomePage(); 
		LoginPage pl=hm.goToSignIn();

		ZohoAppPage zp=pl.LoginIn("odinvas56@gmail.com","Admin@7890");		
		zp.getAppName();
		
		CRMHomePage crm=zp.goToCRM();
		crm.getTopMenu();	
		AccountsPage accpage=crm.goToAccountsPage();
	
		CreateAccountsPage crp=accpage.goToCreateAcc();
		
		crp.createAcc();
		
		//Page.menu.goToAcconts();
		
		
	}
}
