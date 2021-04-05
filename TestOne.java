package SeleniumOnAwsEc2.MavanJava;

//package com.qascripts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestOne {
//	public static void main(String[] args)
	@Test
	public void OpenBrowser()
	{	//"C:\\Users\\mursh\\Documents\\Udemy_Selenium\\Selenium\\chromedriver_89\\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
	
	
	}

}
