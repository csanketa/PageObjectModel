package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLanguagePage 
{
	static WebDriver driver;
	
	public AmazonLanguagePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='hi_IN']")
	WebElement hindi;
		
	@FindBy(xpath="//input[@value='mr_IN']")
	WebElement marathi;
	
	@FindBy(id="icp-save-button")
	WebElement saveLanguage;
	
	@FindBy(xpath="(//span[@dir='ltr'])[1][normalize-space()='English']")
	WebElement englishLanguageShortcut;
	
	//////////////////////////////////////////////////////////////////////////
	
	public void hindiMethod()
	{
	 	Actions a = new Actions(driver);
		a.moveToElement(hindi).click().perform();	
	}
	
	public void marathiMethod()
	{
	 	Actions a = new Actions(driver);
		a.moveToElement(marathi).click().perform();
	}
	
	public void saveLanguageMethod()
	{
	 saveLanguage.click();
	}
	
	public void englishLanguageShortcutMethod()
	{
		Actions a = new Actions(driver);
		a.moveToElement(englishLanguageShortcut).click().perform();
	}
	
	
	
	
}
