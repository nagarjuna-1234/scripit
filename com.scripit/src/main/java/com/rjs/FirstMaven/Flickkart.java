package com.rjs.FirstMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flickkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.name("q")).sendKeys("flipkart");
		//driver.findElement(By.xpath("//input[@name='btnK'or@aria-label='Google Search']")).click();
	
		WebElement closeLoginPopupWebElement=driver.findElement(By.xpath("//button[text()='✕']"));
		closeLoginPopupWebElement.click();
		
	driver.close();
	}


}
