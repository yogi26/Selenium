package com.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRmWebTableAssignment {

	WebDriver driver=null;
	public void openBrowser()
	{
		String url="http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get(url);
	}
	
	public void loginToOrangeHRM()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String welcomeText=driver.findElement(By.id("welcome")).getText();
		if(welcomeText.contains("Welcome"))
		{
			System.out.println("Logged in succesfully - Pass");
		}
		else
		{
			System.out.println("Login Failed - Fail");
			driver.close();
		}
	}
	public void getEmployeeList()
	{
		WebElement pim=driver.findElement(By.linkText("PIM"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		
		WebElement viewEmpPage=driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
		String viewEmpPageLink =viewEmpPage.getAttribute("href");
		viewEmpPage.click();
		 
		if(viewEmpPageLink.equals(driver.getCurrentUrl()))
		{
			System.out.println("View Employee List Page Opened - Pass");
			
			WebElement resultTable=driver.findElement(By.id("resultTable"));
			List<WebElement> rows=resultTable.findElements(By.tagName("tr"));
			
			for(int i=0;i<rows.size();i++)
			{
				List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
				
				for(int j=0;j<cols.size();j++)
				{
					System.out.print(cols.get(j).getText()+" ");
				}
				System.out.println("\n------------------------------------------------");
			}
		}
		else
		{
			System.out.println("Failed to open getEmployee page - Fail");
		}
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	public static void main(String[] args)
	{
		OrangeHRmWebTableAssignment obj=new OrangeHRmWebTableAssignment();
		obj.openBrowser();
		obj.loginToOrangeHRM();
		obj.getEmployeeList();
		obj.closeBrowser();
	}

}
