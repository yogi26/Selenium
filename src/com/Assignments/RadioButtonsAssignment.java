package com.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAssignment 
{
	public static void main(String[] args)
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement radioBlock=driver.findElement(By.className("main"));
		List<WebElement> group1=radioBlock.findElements(By.name("group1"));
		List<WebElement> group2=radioBlock.findElements(By.name("group2"));
		
		for(int i=0;i<group1.size();i++)
		{
			String grp1="";
			String grp2="";
			
			group1.get(i).click();
			group2.get(i).click();
			
			for(int j=0;j<group1.size();j++)
			{
				grp1+=group1.get(j).getAttribute("value")+" - "+group1.get(j).isSelected()+"\n";
				grp2+=group2.get(j).getAttribute("value")+" - "+group2.get(j).isSelected()+"\n";	
			}
			
			System.out.println("------------- Block 1 --------------");
			System.out.println(grp1);
			System.out.println("------------- Block 2 --------------");
			System.out.println(grp2);
		}
		driver.quit();
	}

}
