package com.livetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

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
		
		System.out.println("Title of current page is: "+driver.getTitle());
		driver.close();
	}

}
