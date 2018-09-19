package fb.facebookTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookloginTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MyFrameworks\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void login()
	{
		
		Facebookloginpage fbl=new Facebookloginpage(driver);
		fbl.log();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
