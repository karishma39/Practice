package automation;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();
		String parentId = i.next();
		String childId = i.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}

}
