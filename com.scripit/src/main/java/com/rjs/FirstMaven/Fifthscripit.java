package com.rjs.FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Fifthscripit {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.google.com/");
}	

}
     