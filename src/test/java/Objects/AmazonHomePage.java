package Objects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class AmazonHomePage
{
	WebDriver driver;

	
	public AmazonHomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="field-keywords")
	WebElement search;
	
	@FindBy(id="searchDropdownBox")
	WebElement categoryDropdown;
	
	@FindBy(css = "span[class='a-dropdown-prompt']")
	WebElement filter;
	
	@FindBy(linkText = "Get It by Tomorrow")
	WebElement getItTomorrow;
	
	@FindBy(id = "nav-cart")
	WebElement addToCart;
	
	@FindBy(xpath="(//li[@class='a-dropdown-item'])[2]")
	WebElement lowHigh;
	
	@FindBy(xpath="(//a[normalize-space()='Price: High to Low'])[2]")
	WebElement highLow;
	
	@FindBy(xpath="(//a[normalize-space()='Avg. Customer Review'])[3]")
	WebElement customerReview;
	
	@FindBy(xpath="(//a[normalize-space()='Newest Arrivals'])[4]")
	WebElement newArriavl;
	
	@FindBy(id="nav-link-groceries")
	WebElement freshHeader;
	
	@FindBy(xpath="//button[@data-action='a-popover-close']")
	WebElement freshSkip;
	
	@FindBy(xpath="(//span[@id='GLUXZipUpdate'][contains(normalize-space(),'Apply')])")
	WebElement freshApply;
	
	@FindBy(xpath="//a[@class='nav-a  '][2]")
	WebElement miniHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][3]")
	WebElement sellHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][4]")
	WebElement bestsellHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][5]")
	WebElement dealsHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][6]")
	WebElement mobileHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][7]")
	WebElement serviceHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][8]")
	WebElement primeHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][9]")
	WebElement fashionHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][10]")
	WebElement electronicHeader;
	
	@FindBy(xpath="//a[@class='nav-a  '][11]")
	WebElement releaseHeader;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsList;
	
	@FindBy(id="icp-nav-flyout")
	WebElement language;
	
	@FindBy(id="icp-nav-flyout")
	WebElement languageHover;
	
	@FindBy(id="nav-hamburger-menu")
	WebElement allMenu;
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
	
	public void searchItems(String inputSearch)
	{
		search.sendKeys(inputSearch+Keys.ENTER);	
	}
	
	public void selectCategory(int index)
	{
		Select drop = new Select(categoryDropdown);
		drop.selectByIndex(index);
	}
	
	public void getItTomorrowMethod()
	{
		getItTomorrow.click();	
	}
	
	public void addToCartMethod()
	{
		addToCart.click();	
	}
	
	public void clickFilter()
	{
		//filter.click();	
		try 
		{
			filter.click();	
		}
		catch(StaleElementReferenceException e)
		{
			WebElement FilterDD1 = driver.findElement(By.id("nav-hamburger-menu"));
			FilterDD1.click();
		}
	}
	
	public void lowHighMethod()
	{
		lowHigh.click();	
	}
	
	public void highLowMethod()
	{
		highLow.click();
	}
	
	public void cutomerReviewMethod()
	{
		customerReview.click();	
	}
	
	public void newArrivalMethod()
	{
		newArriavl.click();	
	}
	
	public void freshMethod()
	{
		freshHeader.click();	
	}
	
	public void freshSkipMethod()
	{
		freshSkip.click();	
	}
	
	public void freshApplyMethod()
	{
		freshApply.click();	
	}
	
	public void amazonMiniMethod()
	{
		miniHeader.click();	
	}
	
	public void sellMethod()
	{
		sellHeader.click();	
	}
	
	public void bestsellMethod()
	{
		bestsellHeader.click();	
	}
	
	public void dealsMethod()
	{
		dealsHeader.click();	
	}
	
	public void mobileMethod()
	{
		mobileHeader.click();	
	}
	
	public void serviceMethod()
	{
		serviceHeader.click();	
	}
	
	public void primeMethod()
	{
		//primeHeader.click();	
		Wait<WebDriver> wait5 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement elee = wait5.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-link-amazonprime")));
		elee.click();
	}
	
	public void fashionMethod()
	{
		fashionHeader.click();	
	}
	
	public void electronicMethod()
	{
		electronicHeader.click();	
	}
	
	public void releaseMethod()
	{
		releaseHeader.click();	
	}
	
	public void accountsListMethod()
	{
	 	Actions a = new Actions(driver);
		a.moveToElement(accountsList).perform();	
	}
	
	public void languageMethod()
	{
		language.click();	
	}
	
	public void languageHoverMethod()
	{
		Actions a = new Actions(driver);
		a.moveToElement(languageHover).perform();
	}
	
	public void allMenuMethod()
	{
		try 
		{
			allMenu.click();	
		}
		catch(StaleElementReferenceException e)
		{
			WebElement allMenu1 = driver.findElement(By.id("nav-hamburger-menu"));
			allMenu1.click();
		}
	}
}
