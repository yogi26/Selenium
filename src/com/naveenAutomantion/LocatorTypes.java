package com.naveenAutomantion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTypes {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html");
		
		// 1. xPath
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		// 4 . linkText
		driver.findElement(By.linkText("PIM")).click();
		
		// 5 . partialLinkText
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		// 2. id
		/*driver.findElement(By.id("firstName")).sendKeys("Mangesh");
		driver.findElement(By.id("middleName")).sendKeys("Waman");
		driver.findElement(By.id("lastName")).sendKeys("Giri");
		driver.findElement(By.id("employeeId")).sendKeys("96");*/
		
		//3. name
		/*driver.findElement(By.name("firstName")).sendKeys("Rahul");
		driver.findElement(By.name("middleName")).sendKeys("Nil");
		driver.findElement(By.name("lastName")).sendKeys("suryaa");
		driver.findElement(By.name("employeeId")).sendKeys("55");*/
		
		// 6. cssSelector
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Viahal");
		driver.findElement(By.cssSelector("#middleName")).sendKeys("suraj");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("More");
		driver.findElement(By.cssSelector("#employeeId")).sendKeys("66");
		
		// 7. className
		
		//driver.findElement(By.className("formInputText")).sendKeys("More");
		
		
		driver.findElement(By.id("chkLogin")).click();
		//driver.close();
		

	}

}
