package com.rjs.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr181783");
		driver.findElement(By.name("password")).sendKeys("EvupujE");
		driver.findElement(By.name("btnLogin")).click();
		
		String expectedTitle="Guru99 Bank Manager HomePage";
		String observedTitle=driver.getTitle();
		if(observedTitle.equals(expectedTitle)) {
			System.out.println(" Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}

	}
}
