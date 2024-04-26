package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	ChromeDriver driver;
	public void Setup()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 */
	}
	public void openURL(String url)
	{
		driver.get(url);
	}
	public void login(String uid, String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
	}
	
	public String getErrormessage()
	{
		String str =driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		return str;
	}
}
