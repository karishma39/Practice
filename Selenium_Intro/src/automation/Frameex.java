package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frameex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\Documents\\QA\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("locator")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("locator")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().w
		driver.findElement(By.id("locator")).click();
		
		
	}

}
