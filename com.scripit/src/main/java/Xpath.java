import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("mallela");
		//driver.findElement(by
				
		
	}

}
