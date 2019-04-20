package com.rjs.FirstMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTestCase {
 	public static void main(String[] args) {
	       	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nagbtech219");
		//driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("nagbtech219");
		
//driver.findElement(By.xpath("//input[@id='identifierId'][@type='email']")).sendKeys("nagbtech219");		
		
//driver.findElement(By.xpath("//input[@id='identifierId' and @type='email']")).sendKeys("nagbtech219");	
//driver.findElement(By.xpath("//input[contains(@id,'identifierId')]")).sendKeys("nagarjuna");
//driver.findElement(By.xpath("//input[starts-with(@id,'identifierId')]")).sendKeys("nagarjuna");

String a = driver.findElement(By.xpath("//*[text()='Username and password are case sensitive.']")).getText();
System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nagbtech219@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath1 ("//div/input[@name='password']")).sendKeys("8142061866");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		String expectedTittle="Google account";
		String observedTittle=driver.getTitle();
		
		if(observedTittle .equals(expectedTittle)) { 
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
		*/
		
		driver.quit();
	}

}
