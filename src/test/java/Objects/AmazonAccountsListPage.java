package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAccountsListPage 
{

	static WebDriver driver;
		
		public AmazonAccountsListPage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//span[@class='nav-text'])[1]")
		WebElement createWishList;
		
		@FindBy(xpath="(//span[@class='nav-text'])[2]")
		WebElement wishWebsite;
		
		@FindBy(xpath="(//span[@class='nav-text'])[3]")
		WebElement babyWishList;
		
		@FindBy(xpath="(//span[@class='nav-text'])[4]")
		WebElement discoverStyle;
		
		@FindBy(xpath="(//span[@class='nav-text'])[5]")
		WebElement exploreShowroom;
		
		@FindBy(xpath="(//span[@class='nav-text'])[6]")
		WebElement yourAccount;
		
		@FindBy(xpath="(//span[@class='nav-text'])[7]")
		WebElement yourOrders;
		
		@FindBy(xpath="(//span[@class='nav-text'])[8]")
		WebElement yourWishlist;
		
		@FindBy(xpath="(//span[@class='nav-text'])[9]")
		WebElement yourRecommendations;
		
		@FindBy(xpath="(//span[@class='nav-text'])[10]")
		WebElement yourPrimeMembership;
		
		@FindBy(xpath="(//span[@class='nav-text'])[11]")
		WebElement yourPrimeVideo;

		@FindBy(xpath="(//span[@class='nav-text'])[12]")
		WebElement subscribeSave;

		@FindBy(xpath="(//span[@class='nav-text'])[13]")
		WebElement memberSubscription;

		@FindBy(xpath="(//span[@class='nav-text'])[14]")
		WebElement sellerAccount;

		@FindBy(xpath="(//span[@class='nav-text'])[15]")
		WebElement contentAndDevices;
		
		@FindBy(xpath="(//span[@class='nav-text'])[16]")
		WebElement amazonBusiness;
		
		public void wishListMethod()
		{
			createWishList.click();
		}

		public void wishWebsiteMethod()
		{
			wishWebsite.click();
		}

		public void babyWishListMethod()
		{
			babyWishList.click();
		}

		public void discoverStyleMethod()
		{
			discoverStyle.click();
		}

		public void exploreShowroomMethod()
		{
			exploreShowroom.click();
		}

		public void yourAccountMethod()
		{
			yourAccount.click();
		}

		public void yourOrdersMethod()
		{
			yourOrders.click();
		}

		public void yourWishListMethod()
		{
			yourWishlist.click();
		}

		
		public void yourRecommendationMethod()
		{
			yourRecommendations.click();
		}

		public void yourPrimeMembershiptMethod()
		{
			yourPrimeMembership.click();
		}

		public void yourPrimeVideoMethod()
		{
			yourPrimeVideo.click();
		}

		public void subscribeSaveMethod()
		{
			subscribeSave.click();
		}

		public void memberSubscriptionMethod()
		{
			memberSubscription.click();
		}

		public void sellerAccountMethod()
		{
			sellerAccount.click();
		}

		public void contentAndDevicesMethod()
		{
			contentAndDevices.click();
		}

		public void amazonBusinessMethod()
		{
			amazonBusiness.click();
		}
		
		
	
	
	
}
