package com.DropdownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args)
	{	
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement select=driver.findElement(By.name("country"));
		/*List<WebElement> options=select.findElements(By.tagName("option"));
		
		for(WebElement option:options)
		{
			if(option.isEnabled())
			{
				if(option.getText().equals("INDIA"));
				{
					option.click();
				}
			}
		}
		without select class we cannot select or deselect values from dropdown
		*/
		Select countryName=new Select(select);
		List<WebElement> options=countryName.getOptions();
		
		countryName.selectByVisibleText("INDIA");

	}

}
