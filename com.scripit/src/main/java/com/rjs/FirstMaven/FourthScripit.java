package com.rjs.FirstMaven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class FourthScripit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
