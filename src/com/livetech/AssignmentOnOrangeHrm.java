package com.livetech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnOrangeHrm 
{
	WebDriver driver=null;
	String firstName;
	String middleName;
	String lastName;
	String empId;
	
	public void setData(String firstName,String middleName,String lastName,String empID)
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.empId=empID;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getEmpId()
	{
		return empId;
	}
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
	
	public void login()
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
	public void addEmployee()
	{
		WebElement pim=driver.findElement(By.linkText("PIM"));
		Actions act=new Actions(driver);
		act.moveToElement(pim).perform();
		
		WebElement addEmpPage=driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
		String addEmpPageLink =addEmpPage.getAttribute("href");
		addEmpPage.click();	
		
		if(addEmpPageLink.equals(driver.getCurrentUrl()))
		{
			System.out.println("Add Employee page opened - Pass");
			
			WebElement firstName=driver.findElement(By.xpath("//*[@id='firstName']"));
			firstName.sendKeys(getFirstName());
			
			WebElement middleName=driver.findElement(By.xpath("//*[@id='middleName']"));
			middleName.sendKeys(getMiddleName());
			
			WebElement lastname=driver.findElement(By.xpath("//*[@id='lastName']"));
			lastname.sendKeys(getLastName());
			
			WebElement empId=driver.findElement(By.xpath("//*[@id='employeeId']"));
			empId.clear();
			empId.sendKeys(getEmpId());
			
			
			WebElement saveButton=driver.findElement(By.xpath("//*[@id='btnSave']"));
			saveButton.click();
			
			if(driver.getCurrentUrl().contains("pim/viewPersonalDetails"))
			{
				System.out.println("Employee Added Successfully - Pass");
				
				String empName=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
				String eId=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
				
				String fullName=getFirstName()+" "+getMiddleName()+" "+getLastName();
				
				if((empName.equals(fullName))&&(eId.equals(getEmpId())))
				{
					System.out.println("Employee Name and Id validated - Pass");
				}
				else
				{
					System.out.println("Employee Name and Id validated - Fail");
				}
			}
			else
			{
				System.out.println("Failed to add Employee - Fail");
			}
		}
		else
		{
			System.out.println("Failed to open Add Employee Page - Fail");
			driver.close();
		}
		
	}
	public void logout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		String homepageURL=driver.getCurrentUrl();
		if(homepageURL.contains("/login"))
		{
			System.out.println("Logout Successfull - Pass");
		}
		else
		{
			System.out.println("Failed to Logout - Fail");
		}
	}
	public void closeBrowser() 
	{
		driver.quit();
	}
	public static void main(String[] args)  
	{
		AssignmentOnOrangeHrm obj=new AssignmentOnOrangeHrm();
		obj.setData("Yogesh", "Waman", "Giri", "322");
		obj.openBrowser();
		obj.login();
		obj.addEmployee();
		obj.logout();
		obj.closeBrowser();
	}

}
