package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.Baseclass1;
import com.page.Signuppage;

public class signup extends Baseclass1 {
	
	
	@Test
	public void signupapp() throws InterruptedException {
		
		
		Signuppage signuppage=PageFactory.initElements(driver, Signuppage.class);
		signuppage.signintoDemo("Sachin1221", "12345");
	}
	
	

}
