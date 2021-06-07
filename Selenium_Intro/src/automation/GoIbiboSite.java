package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoIbiboSite {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\Documents\\QA\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("del");
		java.util.List<WebElement> listFrom= driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']/li"));
		//System.out.println(listFrom.size());
		for(WebElement w: listFrom)
		{
			if(w.getText().contains("Delhi Airport"))
			{
				w.click();
				break;
			}
		}
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("ban");
		List<WebElement> listTo= driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']/li"));
		for(WebElement w: listTo)
		{
			if(w.getText().contains("(BLR)"))
			{
				w.click();
				break;
			}
		}
		driver.close();
		
	}

}
