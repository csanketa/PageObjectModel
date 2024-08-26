package Test_Scenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.apache.log4j.xml.DOMConfigurator;


import Objects.AmazonAccountsListPage;
import Objects.AmazonAllOptionsPage;
import Objects.AmazonHomePage;
import Objects.AmazonLanguagePage;


public class TestMethods_HomePage 
{
	static WebDriver driver;
	
	Logger logger = Logger.getLogger("TestMethods_HomePage");
	/*
	//PropertyConfigurator.configure("log4j.properties");
	DOMConfigurator.configure("log4j.xml");
	*/
	
	//TakesScreenshot screenshot = (TakesScreenshot) driver;
	//File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	
	@BeforeTest
	public void beforeTest()
	{
		logger.info("Browser is opening");
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
	
	
	@Test(priority=0)
	public void selectCategory() throws InterruptedException
	{
		logger.info("Selecting category");
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.selectCategory(17);	
		Thread.sleep(3000);
	}
		
	@Test(priority=1)
	public void AppleWatchSearch() throws IOException
	{
		logger.info("Searching iWatch");
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.searchItems("iWatch");	
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\SeleniumWorkspace\\ProjectScreenShots\\homePageScreenshot.png"));
		System.out.println("Homepage screenshot captured");
		
	}
	
	@Test(priority=1)
	public void GetItByTomorrow() throws InterruptedException
	{
		logger.info("Clicking on 'Get it by tomorrow checkbox'");
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.getItTomorrowMethod();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void verifyAddToCart() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.addToCartMethod();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	@Test(priority=2)
	public void lowHighFilter() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.clickFilter();	
		apage.lowHighMethod();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=3, enabled = false)
	public void highLowFilter() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.clickFilter();	
		apage.highLowMethod();
		Thread.sleep(2000);
	}
	
	@Test(priority=4, enabled = false)
	public void customerReviewFilter() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.clickFilter();	
		apage.cutomerReviewMethod();
		Thread.sleep(2000);	
	}
	
	@Test(priority=5, enabled = false)
	public void newestArrivalFilter() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.clickFilter();	
		apage.newArrivalMethod();
		Thread.sleep(2000);
		System.out.println("Tested all filters");
	}
	
	@Test(priority=6, enabled = false)
	public void verifyFreshHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.freshMethod();
		System.out.println("Clicked on Fresh Header");
	}

	@Test(priority=7, enabled = false)
	public void clickApplySkip() throws InterruptedException
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		//Get all window handles
			Set<String> windowHandles = driver.getWindowHandles();

			//Switch to new window
			for(String handle : windowHandles)
			{
				driver.switchTo().window(handle);
			}
			apage.freshApplyMethod();
			Thread.sleep(2000);
			
			apage.freshSkipMethod();
	}
	
	@Test(priority=8, enabled = false)
	public void verifyAmazonMiniHeader() throws InterruptedException 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.amazonMiniMethod();
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@Test(priority=9, enabled = false)
	public void verifySellHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.sellMethod();
	}
	
	@Test(priority=10, enabled = false)
	public void verifyBestSellerHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.bestsellMethod();
	}
	
	@Test(priority=11, enabled = false)
	public void verifyDealsHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.dealsMethod();
	}
	
	@Test(priority=12, enabled = false)
	public void verifyMobilesHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.mobileMethod();
	}
	
	@Test(priority=13, enabled = false)
	public void verifyServiceHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.serviceMethod();
	}
	
	@Test(priority=14, enabled = false)
	public void verifyPrimeHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.primeMethod();
	}
	
	@Test(priority=15, enabled = false)
	public void verifyFashionHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.fashionMethod();
	}
	
	@Test(priority=16, enabled = false)
	public void verifyElectronicsHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.electronicMethod();
	
		/*
		boolean pageReady = isPageReady(driver);
		if (pageReady)
		{
		System.out.println("Page is fully ready");	
		}
		else
		{
			System.out.println("Page is still loading");	
		}
		*/
	}
	/*
	public static boolean isPageReady(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until((ExpectedCondition<Boolean>) webDriver->
		{
			assert webDriver != null;
			return((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
		});
	}
	*/
	
	@Test(priority=17)
	public void verifyNewReleasesHeader() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.releaseMethod();
		System.out.println("Clicked on All Header options");
	}
	
		
	@Test(priority=18)
	public void verifyAccountsList() 
	{
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.accountsListMethod();
	}
	

	@Test(priority=19)
	public void verifyCreateWishList() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.wishListMethod();
	}
	
	/*
	 
	@Test(priority=20)
	public void verifyWishWebsite() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.wishWebsiteMethod();
	}	 
	 
	@Test(priority=21)
	public void verifyBabyWishList() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.babyWishListMethod();
	}
	
	
	
	@Test(priority=22)
	public void verifyDiscoverStyle() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.discoverStyleMethod();
	}
	
	@Test(priority=23)
	public void verifyExploreShowroom() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.exploreShowroomMethod();
	}
	
	@Test(priority=24)
	public void verifyYourAccount() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourAccountMethod();
	}
	
	@Test(priority=25)
	public void verifyYourOrders() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourOrdersMethod();
		driver.navigate().back();
	}
	
	@Test(priority=26)
	public void verifyYourWishList() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourWishListMethod();
	}
	
	@Test(priority=27)
	public void verifyYourRecommendation() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourRecommendationMethod();
	}
	
	@Test(priority=28)
	public void verifyPrimeMembership() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourPrimeMembershiptMethod();
		driver.navigate().back();
	}
	
	@Test(priority=29)
	public void verifyYourPrimeVideo() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.yourPrimeVideoMethod();
		driver.navigate().back();
	}
	
	@Test(priority=30)
	public void verifySubscribeAndSave() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.subscribeSaveMethod();
		driver.navigate().back();
	}
	
	@Test(priority=31)
	public void verifyMemberSubscription() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.memberSubscriptionMethod();
		driver.navigate().back();
	}
	
	@Test(priority=32)
	public void verifySellerAccount() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.sellerAccountMethod();
	}
	
	@Test(priority=33)
	public void verifyContentAndDevices() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.contentAndDevicesMethod();
		driver.navigate().back();
	}
	
	@Test(priority=34)
	public void verifyAmazonBusiness() 
	{
		verifyAccountsList();
		AmazonAccountsListPage apage = new AmazonAccountsListPage(driver);
		apage.amazonBusinessMethod();
		driver.navigate().back();
	}
	
	
	
	@Test(priority=35)
	public void verifyLanguageOptions() 
	{		
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.languageMethod();
	}
	
	@Test(priority=36)
	public void verifyHindiLanguage() throws InterruptedException 
	{		
		AmazonLanguagePage apage = new AmazonLanguagePage(driver);
		apage.hindiMethod();
		Thread.sleep(2000);
	}
	
	@Test(priority=37)
	public void verifyMarathiLanguage() 
	{		
		AmazonLanguagePage apage = new AmazonLanguagePage(driver);
		apage.marathiMethod();
	}
	
	@Test(priority=38)
	public void verifySaveLanguage() throws InterruptedException 
	{		
		AmazonLanguagePage apage = new AmazonLanguagePage(driver);
		apage.saveLanguageMethod();
		Thread.sleep(2000);
	}
	
	@Test(priority=39)
	public void verifyLanguageHover() throws InterruptedException 
	{		
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.languageHoverMethod();
		Thread.sleep(2000);
	}
	
	@Test(priority=40)
	public void verifyEnglishLanguageShortcut() throws InterruptedException 
	{		
		AmazonLanguagePage apage = new AmazonLanguagePage(driver);
		apage.englishLanguageShortcutMethod();
		Thread.sleep(2000);
	}
	*/
	
	@Test(priority=41)
	public void verifyAllMenuOptions()
	{		
		AmazonHomePage apage = new AmazonHomePage(driver);
		apage.allMenuMethod();
	}
	
	@Test(priority=42)
	public void verifyAllBestSeller()
	{		
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allBestSellerMethod();
	}
	
	@Test(priority=43)
	public void verifyAllNewReleases()
	{		
		verifyAllMenuOptions();
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allNewReleasesMethod();
	}
	
	@Test(priority=44)
	public void verifyAllMoversShakers()
	{		
		verifyAllMenuOptions();
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allMoversSakersMethod();
	}
	
	/*
	@Test(priority=45)
	public void verifyAllAmazonMini()
	{		
		verifyAllMenuOptions();
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allAmazonMiniMethod();
	}
	
	
	@Test(priority=46)
	public void verifyAllEchoAlexa()
	{		
		verifyAllMenuOptions();
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allEchoAlexaMethod();
	}
	
	@Test(priority=47)
	public void verifyAllAlexaSkills()
	{		
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allAlexaSkillsMethod();
	}
	
	@Test(priority=48)
	public void verifyAlexaEducationReference()
	{		
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.alexaEduReferenceMethod();
	}
	*/

	@Test(priority=49)
	public void verifyAllSignIn() throws InterruptedException
	{		
		verifyAllMenuOptions();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(3000);
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.signInMethod();
		driver.navigate().back();
	}
	
	@Test(priority=50)
	public void verifyAllCloseIcon()
	{	
		AmazonAllOptionsPage apage = new AmazonAllOptionsPage(driver);
		apage.allCloseMethod();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
	*/	
}
