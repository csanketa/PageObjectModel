package Test_Scenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearch;

public class TestMethods_GoogleSearch 
{

	WebDriver driver;
	GoogleSearch pageRepo;
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Browser is initializig");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		
		driver.get("https://www.amazon.in/");
	}	
	
	@Test
	public void SearchOptions()
	{
		GoogleSearch page = new GoogleSearch(driver);
		page.searchGoogle("facebook");
		//pageRepo = new GoogleSearch(driver);
		//pageRepo.searchGoogle("facebook");
	}
	
	@Test(priority=1)
	public void clickFacebook()
	{
		GoogleSearch page = new GoogleSearch(driver);
		page.searchFacebook();
	}
	
	@Test(priority=2)
	public void loginFacebook()
	{
		FacebookPage fbpage = new FacebookPage(driver);
		fbpage.searchId("Testuser");
		fbpage.searchPass("Tester123");
		fbpage.verifyLogin();		
	}
	
	
	
	
	
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
	
}
