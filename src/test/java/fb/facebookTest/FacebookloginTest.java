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
	Facebookloginpage fbl;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MyFrameworks\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority=1)
	public void login()
	{
		
		fbl=new Facebookloginpage(driver);
		fbl.log();
	}
	@Test(priority=2)
	public void logo1() 
	{
		fbl=new Facebookloginpage(driver);
		boolean flag=fbl.logo();
		System.out.println(flag);
	
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
