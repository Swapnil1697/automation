package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;



public class Tc_LoginTest_001 extends BaseClass {
	
	
	@Test
	
	public void loginTest() throws IOException {
		
		
		
		Logger.info("URL is opened");
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("username is entered");
		lp.setPassword(password);
		Logger.info("Password is entered");
		lp.clickSubmit();
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Logger.info("Login test is passed");
		}
		
			else
			{
				captureScreen(driver,"loginTest");
				Assert.assertTrue(false);
				Logger.info("Login test failed");
			}
			Logger.info("Login test is failed");
		
		
	}

}
