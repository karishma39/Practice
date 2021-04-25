package automation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		int rows= driver.findElements(By.xpath("//table[@id='product' and @class='table-display'] //tbody //tr")).size();
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='product' and @class='table-display']/tbody/tr[3]/td"));
		System.out.println("rows: "+rows+" cols: "+cols.size());
		for(int i=0; i<cols.size();i++)
		{
			System.out.print(cols.get(i).getText()+" ");
		}
	}

}
