package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementDemo {

	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html");
		
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		
		driver.findElement(By.id("btnLogin")).click();*/
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

	}

}
