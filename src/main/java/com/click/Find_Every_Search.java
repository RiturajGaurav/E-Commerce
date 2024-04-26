package com.click;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_Every_Search 
{

	ChromeDriver driver;

	public void Setup() 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}

	public void OpenURL(String url) 
	{
		driver.get(url);
	}

	public void Search(String input1) 
	{
		driver.findElement(By.name("q")).sendKeys(input1);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	public void getResults()
	{
		List<WebElement> lst =driver.findElements(By.xpath("//h3[contains(text(),'Tutorial')]"));
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
			/*
			 * lst.get(i).click(); try(Thread.sleep(2000);) catch (Exception e) ()
			 * driver.navigate().back();
			 */
		}
	}
			 public void tearDown()
			 {
				 driver.quit();
			 }	

}
