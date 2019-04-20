package com.rjs.FirstMaven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScripit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://google.com");  // entering the url in address bar
		String url=driver.getCurrentUrl();
		System.out.println("current url:"+url);
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
		
		

	}
}
