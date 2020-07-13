import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Eclippse\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("https://www.thrillophilia.com/consumers/sign_in");
		driver.findElement(By.id("consumer_email")).sendKeys("trainer@Way2automation.com");
		driver.findElement(By.id("consumer_password")).sendKeys("dsdsdsd");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
