package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\Documents\\QA\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		String getMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Caption']")).getText();
		while(!getMonth.equals("May 2021"))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			getMonth = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Caption']")).getText();
		}
		List<WebElement> dayscount= driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Body'] //div[@class='dateInnerCell']"));
		for(int i=0;i<dayscount.size();i++)
		{
			String day= driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Body'] //div[@class='dateInnerCell'] //p[1]")).get(i).getText();
			if(day.equals("10"))
			{
				driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Body'] //div[@class='dateInnerCell'] //p[1]")).get(i).click();
				break;
			}
		}
	}
}
