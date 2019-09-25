package com.livetech;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOnError
{
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=null;
		String url="http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin1");
		try
		{
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			String welcomText=driver.findElement(By.id("welcome")).getText();
			if(welcomText.equals("Welcome Admin"))
			{
				System.out.println("Test Passed ");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Test Failed- Screentshot taken");
			String spanMessge=driver.findElement(By.id("spanMessage")).getText();
			if(spanMessge.equals("Invalid credentials"))
			{
				File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(screenshot, new File("C:\\Users\\HP\\Desktop\\image\\error.png"));
			}
		}
		driver.quit();
		
	}
}
