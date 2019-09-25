package com.livetech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDopOnW3school {

	// not confirmed weather it is working or not
	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		String url="https://www.w3schools.com/html/html5_draganddrop.asp";
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("google_ads_iframe_/22152718/sws-hb//w3schools.com//mid_content_0");
		
		WebElement dragElement=driver.findElement(By.id("drag1"));
		WebElement dropElement=driver.findElement(By.id("div2"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();
	}

}
