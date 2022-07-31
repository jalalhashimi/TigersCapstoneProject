package page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	//Scenario 1
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAdnNoteBooksLink;
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksLink;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement mackBookItem;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAlert;
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement  OneitemWithDollarAmount;
	@FindBy (xpath = "//button[@type='button' and @data-toggle='dropdown']")
	private WebElement cartOptionDetails;
	@FindBy (xpath = "//button[@type='button' and @title='Remove']")
	private WebElement xButton;
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement zeroItemWithZeroDollar;
	
	//Scenario 2
	
	
	
	@FindBy (xpath = "//div[@id='content']//div[4]//div[2]//div//div[2]//div[2]/button[3]")
	WebElement compareMacBookButton;
	
	@FindBy (xpath = "//div[@id='content']/div[4]/div[4]/div/div[2]/div[2]/button[3]/i")
	WebElement compareMacBookProButton;
	
	@FindBy (xpath = "//a[@id='compare-total']")
	WebElement productCompareLink;
	
	//Following is the temp 
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy (xpath = "//div[@id='content']/h1")
	WebElement productComparisonChart;
	
	
	
	//Scenario 3
	@FindBy (xpath = "//div[@id='content']//div[4]//div[5]//div//div[2]//div[2]//button[2]")
	WebElement addToWishListButton;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageToCreateAnAccoutToSaveItemInCart;
	//Scenario 4
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	WebElement MacBookProLink;
	@FindBy(xpath = "//h2[normalize-space()='$2,000.00']")
	private WebElement userCanSeeThePrice$2000;
	//Scenario 1 Methods
	public void clickOnLaptopsAndNotebooks () {
		laptopsAdnNoteBooksLink.click();
	}
	public void clickOnShowAllLaptopsAndNotebooks () {
		showAllLaptopsAndNotebooksLink.click();
	}
	public void clickOnMacBookItem() {
		mackBookItem.click();
	}
	public String showSuccessMessage() {
		String text = successAlert.getText();
		return text;
	}
	public String showOneItemWithDollarAmount () {
		String text = OneitemWithDollarAmount.getText();
		return text ;
	}
	public void clickonCartOptionDetails () {
		cartOptionDetails.click();
	}
	public void clickXButtonToRemoveAnItem () {
		xButton.click();
	}
	public String showZeroItemWithZeroDollarAmount() {
		String text = zeroItemWithZeroDollar.getText();
		return text ;
	}
	//Scenario 2 Methods
	
	
	
	
	public void clickOnCompareThisProductButtonforMacBook() {
		compareMacBookButton.click();
	}
	public void clickOnCompareThisProductButtonForMacBookPro() {
		compareMacBookProButton.click();
	}
	public String showCompareSuccessMessage() {
		String text = successMessage.getText();
		return text;
	}
	public void clickOnProductCompareLink() {
		productCompareLink.click();
	}
	public String productCompareChart() {
		String comparisonText = productComparisonChart.getText();
		return comparisonText;
	}
	
	//Scenario 3 Methods
	public void clickOnWishListButton() {
		addToWishListButton.click();
	}

	public String showYouMustCreateAnAccountToSaveItemToWishListMessage(String text1) {
		String text = messageToCreateAnAccoutToSaveItemInCart.getText();
		return text;
	}

	// Scenario 4 Method
	public void clickOnMacBookPro() {
		MacBookProLink.click();
	}

	public void userCanSeeThePrice$2000() {
		userCanSeeThePrice$2000.isDisplayed();
	}
}
