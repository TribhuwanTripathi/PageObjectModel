package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuppage  {
	
	WebDriver driver;
	
	public void SignupPage(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	@FindBy(id="signin2")
	WebElement sname;
	
	@FindBy(id="sign-username")
	WebElement uname;
	
	@FindBy(id="sign-password")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	WebElement button;
	
	
	public void signintoDemo(String username, String password) throws InterruptedException {
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sname.click();
		Thread.sleep(3000);
		uname.sendKeys(username);
		Thread.sleep(3000);
		pswd.sendKeys(password);
		Thread.sleep(3000);
		button.click();
		
		
		
	} 
}




