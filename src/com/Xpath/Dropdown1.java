package com.Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
		
		Select status=new Select(driver.findElement(By.id("candidateSearch_status")));
		List<WebElement> list=status.getOptions();
		System.out.println(list);
		for(WebElement option:list)
		{
			System.out.println(option.getText());
		}
	}

}
