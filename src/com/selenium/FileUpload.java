package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='photofile']")).sendKeys("c:\\Users\\HP\\Desktop\\Collection_imag1.jpg");
	}

}
