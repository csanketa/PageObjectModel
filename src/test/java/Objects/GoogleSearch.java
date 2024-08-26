package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch 
{
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="APjFqb")
	WebElement searchBox;
	
	//By searchBox = By.xpath(("//textarea[@class'gLFyf']");
	//By searchBox = By.xpath(("//div/input[@type='search']"));
	
	@FindBy(xpath="//h3[normalize-space()='Facebook - log in or sign up']")
	WebElement facebook;
	
	public void searchGoogle(String searchInput)
	{
		try
		{
			//driver.findElement(searchBox).sendKeys(searchInput+Keys.ENTER);
			searchBox.sendKeys(searchInput+Keys.ENTER);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	public void searchFacebook()
	{
		try
		{
			facebook.click();
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		
	}
	
	
	
	
	
}
