package com.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotAssinment
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			try
			{
	 			links.get(i).click();
				String title=links.get(i).getText();
				File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(screenshot, new File("C:\\Users\\HP\\Desktop\\image\\"+title+".png"));
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
