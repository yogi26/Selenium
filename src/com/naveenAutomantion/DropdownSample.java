package com.naveenAutomantion;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSample {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html");
		driver.manage().window().maximize();
		
		// 1. xPath
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_status']")));
		//select.selectByIndex(1);
		List<WebElement> list=select.getOptions();
		
		// Three ways to retrive data from list
		
		Iterator<WebElement> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		/*for(WebElement w:list)
		{
			System.out.println(w.getText());
		}*/
		
		
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		
		driver.close();
	}

}
