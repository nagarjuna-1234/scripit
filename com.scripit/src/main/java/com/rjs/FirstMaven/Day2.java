package com.rjs.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mtouch.facebook.com/login/");
		
		driver.findElement(By.name("email")).sendKeys("9052424155");
		driver.findElement(By.name("pass")).sendKeys("9052424155");
		driver.findElement(By.name("login")).click();
		
		
		String expectedTittle="Facebook";
		String obseredTittle=driver.getTitle();
		
		System.out.println("observed title:"+obseredTittle);
		if(obseredTittle.equals(expectedTittle)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
		
		}
	}


