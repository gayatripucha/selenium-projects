package com.vmware.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://eenadupellipandiri.net/");
		
		driver.findElement(By.id("name")).sendKeys("ravilella");
		
		driver.findElement(By.xpath("//input[contains(@class,'inputtext firepath-matching-node')]"));

	}

}
