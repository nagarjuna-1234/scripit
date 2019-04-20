package com.rjs.FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SecondScripit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http;//google.com");
	}
} 
  