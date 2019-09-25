package com.livetech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperatonOnFlipkart {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		String url="https://www.flipkart.com/?affid=opicleweb&affExtParam1=Vinauh";
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))).perform();
		
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/span[1]"))).perform();
		
		
	}

}
