package com.vmware.admin;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbcDriver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\abc.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\xyz.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String s = driver.getPageSource();
		System.out.println(s);
		
		driver.close();
		
		//driver.quit();
		

	}

}
