package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
		
		
		Select status=new Select(driver.findElement(By.id("candidateSearch_status")));
		//status.selectByVisibleText("Rejected");
		//status.selectByIndex(2);
		Thread.sleep(1000);
		status.selectByValue("INTERVIEW PASSED");
		

	}

}
