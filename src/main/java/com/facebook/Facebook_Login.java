package com.facebook;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {

	public static void main(String[] args){
		
		/*
		 * ChromeOptions option = new ChromeOptions();
		 * option.addArguments("remote-allow-origins=*");
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome Launch Succesfully");
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.name("firstname")).sendKeys("Abhilash");
		driver.findElement(By.name("lastname")).sendKeys("Ukande");
		driver.findElement(By.name("reg_email__")).sendKeys("abhilashukande.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abhilash@ukande123");
		
		new Select(driver.findElement(By.id("day"))).selectByValue("17");
		new Select(driver.findElement(By.id("month"))).selectByIndex(2);
		new Select(driver.findElement(By.id("year"))).selectByValue("1998");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}
}