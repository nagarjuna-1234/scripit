package com.rjs.FirstMaven;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdScripit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.chrome", "./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
	}

}
 