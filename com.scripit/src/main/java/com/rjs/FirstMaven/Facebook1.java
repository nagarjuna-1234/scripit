 package com.rjs.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mtouch.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("9581484814");
		driver.findElement(By.name("pass")).sendKeys("8142061866");
		driver.findElement(By.name("login")).click();
		
		String expectedTitle="Facebook";
		String observedTitle=driver.getTitle();
		if(observedTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println(" Test case is pass");
		}
		else {
			System.out.println("Test case is fail");        
		}
		}
		
		
		
		
		
		
		
		
	}


