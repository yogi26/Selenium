package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		//Login Page
		/*driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();*/
		
		//Using conatains() method
		/*driver.findElement(By.xpath("//*[contains(@id, 'txtUse')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[contains(@id, 'txtPas')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[contains(@id, 'btnLo')]")).click();*/
		
		//using starts-with() method
		driver.findElement(By.xpath("//*[starts-with(@id,'txtU')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[starts-with(@id,'txtP')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[starts-with(@id,'btn')]")).click();
		
		//using text() method
	}

}
