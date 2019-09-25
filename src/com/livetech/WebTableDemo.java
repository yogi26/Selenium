package com.livetech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		for(int i=2;i<10;i++)
		{
			for(int j=2;j<6;j++)
			{
				System.out.println(driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println("------------------------------------------");
		}
		
		driver.quit();
	}

}
