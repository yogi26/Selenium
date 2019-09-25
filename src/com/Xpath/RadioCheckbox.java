package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckbox {

	public static void main(String[] args)
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click();
		
		WebElement allCheckbox = driver.findElement(By.xpath("//*[text()='All']"));
		WebElement rejectedCheckbox = driver.findElement(By.xpath("//*[text()= 'Rejected']"));
		WebElement cancelledCheckbox = driver.findElement(By.xpath("//*[text()='Cancelled']"));
		WebElement pendingApprovalCheckbox = driver.findElement(By.xpath("//*[text()='Pending Approval']"));
		WebElement scheduledCheckbox = driver.findElement(By.xpath("//*[text()='Scheduled']"));
		WebElement takenCheckbox = driver.findElement(By.xpath("//*[text()='Taken']"));
		
		allCheckbox.click();
		if(allCheckbox.isEnabled())
		{
			System.out.println("Selected");
		}
		takenCheckbox.click();
		if(takenCheckbox.isSelected())
		{
			takenCheckbox.click();
		}
	}

}
