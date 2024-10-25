package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	
	WebDriver driver;
	

	public void LoginPage(WebDriver ldriver) {
		this.driver =  ldriver;
	}


	@FindBy(id = "user-name")
	WebElement uname;

	@FindBy(id = "password")
	WebElement pswd;

	@FindBy(id = "login-button")
	WebElement button;

	public void loginToSaucedemo(String username, String password) throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		uname.sendKeys(username);
		Thread.sleep(3000);
		pswd.sendKeys(password);
		Thread.sleep(3000);
		button.click();
		Thread.sleep(3000);
	}

}



