package com.livetech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpetionsDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		String url="http://amazon.in";
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement accountAndLinks=driver.findElement(By.id("nav-link-accountList"));
		
		Actions action=new Actions(driver);
		action.moveToElement(accountAndLinks).perform();
		
		//new Actions(driver).moveToElement(accountAndLinks).perform();// one line code for mouse Hover
		
		driver.findElement(By.id("nav_prefetch_yourorders")).click();
	}

}
