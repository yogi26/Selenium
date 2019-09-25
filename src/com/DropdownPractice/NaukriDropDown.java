package com.DropdownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriDropDown {

	public static void main(String[] args)
	{	
		WebDriver driver=null;
		String url="https://www.naukri.com/account/register/basicdetails";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("city")).sendKeys("Pune");
		/*WebElement select=driver.findElement(By.name("city"));		
		Select countryName=new Select(select);
		countryName.selectByVisibleText("Pune");*/


		
	

	}

}
