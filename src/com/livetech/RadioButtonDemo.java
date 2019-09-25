package com.livetech;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo
{
	public static void main(String[] args) 
	{
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radioButtons=table.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
		for(int i=0;i<radioButtons.size();i++)
		{
			WebElement radio=radioButtons.get(i);
			radio.click();
			for(int j=0;j<radioButtons.size();j++)
			{
				boolean status=radioButtons.get(j).isSelected();
				System.out.println(radioButtons.get(j).getAttribute("value")+": "+status);
			}
			System.out.println("------------------------------------------");
		}
		driver.quit();
	}
}
