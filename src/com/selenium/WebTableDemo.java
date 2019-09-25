package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		for(int i=1;i<5;i++)
		{
			WebElement data=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr["+i+"]/td[3]/a[1]"));
			String name=data.getText();
			data.click();
			System.out.println(name);
			if(name.contains("Yogesh"))
			{
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr["+i+"]/td[1]/input[1]")).click();
				//System.out.println("You have selected :"+name);
			}
		}
		//driver.quit();
	}

}
	