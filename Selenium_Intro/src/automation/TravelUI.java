package automation;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class TravelUI {



	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\QA\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("http://spicejet.com"); //URL in the browser

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);


		Select adults = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		adults.selectByVisibleText("5");
		Select currency = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		currency.selectByValue("INR");

		driver.findElement(By.cssSelector("input[value='Search']")).click();


	}



}