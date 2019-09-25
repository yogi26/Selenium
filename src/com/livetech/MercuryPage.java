package com.livetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
	
		//<a href="mercuryregister.php">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		String hrefAttribute = register.getAttribute("href");
		System.out.println("Attribute value is : "+hrefAttribute);
		
		register.click();
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println("After clicking url is : "+actualUrl);
		
		if(actualUrl.equals(hrefAttribute))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
