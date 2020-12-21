package com.bit.test;

import org.junit.Test;

import pages.CamisPage;
import pages.Header;
import pages.HomePage;
import pages.TopsOptionPage;
import pages.WomenPage;


public class SmokeTest extends BaseTest {
	WomenPage wp;
	TopsOptionPage tp;
	CamisPage cp;
	
	@Test
	public void m1() {
		HomePage hp = new HomePage(driver);
		tp=(TopsOptionPage) hp.clickOnWomenMenu().get();
	}
	
	
	
	@Test
	public void buyATops() {
		HomePage hp = new HomePage(driver);
		hp.verifyHomePageLogo();
		wp=hp.clickOnWomenMenu();//new TopsOptionPage()
		hp.clickOnExpressOutlet();
		cp=tp.clickcamisPage();
	}
	@Test
	public void buyTShirt() {
		HomePage hp = new HomePage(driver);
		hp.verifyHomePageLogo();
		hp.clickOnWomenMenu();
		
	}
	
	
		
	

}


