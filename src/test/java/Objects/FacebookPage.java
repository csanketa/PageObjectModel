package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage 
{
WebDriver driver;
	
	public FacebookPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement id;
	
	@FindBy(id="pass")
	WebElement pass;
	
	//@FindBy(xpath="button[@type='submit']")
	//WebElement submit;
		
	By submit = By.xpath("//label/input[@value='Log In']");
	
	public void searchId(String inputId)
	{
		try
		{
			id.sendKeys(inputId);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}		
	}
	
	public void searchPass(String inputPass)
	{
		try
		{
			pass.sendKeys(inputPass);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}		
	}
	
	public void verifyLogin()
	{
			driver.findElement(submit).click();
			String title = driver.getTitle();
			assertEquals(title,"Login page");
			
	}
	
	
	
	
	
	
	
}
