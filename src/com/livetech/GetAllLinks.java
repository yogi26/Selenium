package com.livetech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Count of links is :"+links.size());
		String linkName;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				linkName=links.get(i).getText();
				System.out.println(i+" "+linkName);
			}
		}
		
		driver.close();

	}

}
