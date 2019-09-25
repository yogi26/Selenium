package com.livetech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {

	public static void main(String[] args)
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
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement pim=driver.findElement(By.linkText("PIM"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		
	}

}
