package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAllOptionsPage 
{

	WebDriver driver;

	public AmazonAllOptionsPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='hmenu-item'])[1]")
	WebElement allBestSeller;

	@FindBy(xpath="(//a[@class='hmenu-item'])[2]")
	WebElement allNewReleases;

	@FindBy(xpath="(//a[@class='hmenu-item'])[3]")
	WebElement allMoversShakers;

	@FindBy(xpath="(//a[@class='hmenu-item'])[4]")
	WebElement allAmazonMini;

	@FindBy(xpath="(//a[@class='hmenu-item'])[5]")
	WebElement allEchoAlexa;

	@FindBy(linkText="Alexa Skills")
	WebElement allAlexaSkills;	

	@FindBy(xpath="(//span[@dir='auto'])[3]")
	WebElement AlexaEduReference;	

	@FindBy(linkText="Sign in")
	WebElement signIn;

	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
	WebElement allCloseIcon;	


	/////////////////////////////////////////////////////////////////////////////

	public void allBestSellerMethod()
	{
		allBestSeller.click();	
	}

	public void allNewReleasesMethod()
	{
		allNewReleases.click();	
	}

	public void allMoversSakersMethod()
	{
		allMoversShakers.click();	
	}

	public void allAmazonMiniMethod()
	{
		allAmazonMini.click();	
	}

	public void allEchoAlexaMethod()
	{
		allEchoAlexa.click();	
	}

	public void allAlexaSkillsMethod()
	{
		Actions a = new Actions(driver);
		a.moveToElement(allAlexaSkills).click().perform();
	}

	public void alexaEduReferenceMethod()
	{
		AlexaEduReference.click();	
	}

	public void signInMethod()
	{
		signIn.click();	
	}

	public void allCloseMethod()
	{
		allCloseIcon.click();	
	}


}
