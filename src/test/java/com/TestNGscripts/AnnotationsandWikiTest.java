package com.TestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsandWikiTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup()
	{
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\New Pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();  // delete cookies on the browser
		
	
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
	}
		
		@BeforeMethod
		public void login() 
		
		{
			System.out.println("loginto the application, enter username and password");
			
		}
			//In real time write the proper code----driver.findelement(By.id etc.....by inspecting the element and click etc
		    
		

		@Test (priority='1')
		public void createAccount() throws InterruptedException
			

// test steps to perform testcase goes here
		
{
driver.findElement(By.id("wpName2")).sendKeys("Username1");	


Thread.sleep(3000);

// Inspect password textbox and enter data in the text box
driver.findElement(By.name("wpPassword")).sendKeys("password@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@value='Create your account']"));

}
	
	
		@Test(priority='2')
		public void MainPage() throws InterruptedException
		{
			Thread.sleep(3000);
			
	           driver.findElement(By.linkText("Main page")).click();
		
		
		}
		
		@AfterMethod
		public void logout() throws InterruptedException
		{
			System.out.println("logout of the application.");
		}
		
		
		
		// close my browser, close the server or close tabs
		// @Afterclass annotation is given that method which will be executed after all the test methods will get executed
		@AfterClass
		public void closebrowser()
		{
			driver.close();
		}
		
}