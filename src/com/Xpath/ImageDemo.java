package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id='menu_dashboard_index']/b")).click();
		//driver.findElement(By.xpath("//*[@src='/orangehrm/symfony/web/webres_598bd8c4489f52.47381308/orangehrmLeavePlugin/images/ApplyLeave.png']"));
		driver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@class='quickLaungeContainer']/tbody/tr/td[3]/div/a/span")).click();
		driver.navigate().back();
	
	}

}
