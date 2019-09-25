package com.livetech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8081/orangehrm/symfony/web/index.php/auth/login.html");
		driver.manage().window().maximize();
		
		String expectedTitle="OrangeHRM";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title Matched : PASS");
		}
		else
		{
			System.out.println("Title not matched : FAIL");
		}
		driver.close();

	}

}
