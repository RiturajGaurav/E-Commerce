package com.pageModel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POM_LinkedIn {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("session_key")).sendKeys("gstaffingofficial@gmail.com");
		
		driver.findElement(By.id("session_password")).sendKeys("Sanju@5547");
		driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
	}
}