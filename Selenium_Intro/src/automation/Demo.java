package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create object for Chrome driver
		//invoke browser first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karishma.oberoi\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.twitter.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='session[username_or_email]']")));
		element1.sendKeys("karishmaoberoi94@gmail.com");
		//driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys("karishmaoberoi94@gmail.com");
		driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys("9756665265");
		driver.findElement(By.cssSelector("div[data-testid='LoginForm_Login_Button']")).click();
		driver.findElement(By.cssSelector("a[aria-label='Profile']")).click();
		WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/settings/profile']")));
		element2.click();
	}

} 
