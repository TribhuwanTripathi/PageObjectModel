package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserFactory {
	
	
		
			
			public static WebDriver startapplication(WebDriver driver , String browserName , String appUrl) {
				
				if(browserName.equals("Chrome")) {
					
					driver=new ChromeDriver();
					
					
					
				}else if(browserName.equals("Edge")){
					
					driver=new EdgeDriver();
				}else if(browserName.equals("Firefox")) {
					
					driver=new FirefoxDriver();
				}else {
					
					System.err.println("Wrong driver");
				}
				//Sets the amount of time to wait for a page load to complete before throwing an error. 
		
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				driver.get(appUrl);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
				
				return driver;
				
				
				
				
			}
			
			public static void quitBrowser(WebDriver driver) {
				
				driver.close();
				
				
			}

}
