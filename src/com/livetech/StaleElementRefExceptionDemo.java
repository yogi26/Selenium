package com.livetech;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		String url="http://newtours.demoaut.com/";
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			try
			{
				links.get(i).click();
				Thread.sleep(2000);
				driver.navigate().back();
			}
			catch(StaleElementReferenceException e)
			{
				links=driver.findElements(By.tagName("a"));
			}
			
		}
		driver.quit();
	}

}
