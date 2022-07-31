package page.Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObject extends Base{

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy (xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsLink;
	
	@FindBy (tagName = "img")
	private List<WebElement> items;
	
	@FindBy (xpath = "//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement addToCartOptionOnHPLP3065Item;
	
	@FindBy (xpath = "//input[@name='quantity' and @id='input-quantity']")
	private WebElement selectQuantity;
	
	@FindBy (xpath = "//button[@type='button' and @id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	//Scenario 3
	@FindBy (xpath = "//div[@id='content']/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement canonEOS5DItem;
	@FindBy (xpath = "//select[@id='input-option226']")
	private WebElement colorDropDown;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement canonEOS5DCameraSuccessMessage;
	
	//Scenario 4
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCameraLink;
	
	@FindBy (xpath = "//a[text()='Write a review']")
	private WebElement writeAReviewLink ;
	
	@FindBy (id = "input-name")
	private WebElement yourName;
	
	@FindBy (id = "input-review")
	private WebElement yourReview;

	//I am putting this radio button inside a List
//	@FindBy (xpath = "//input[@type='radio' and @value='5']")
//	private WebElement ratingRadioButton5;
	@FindBy (xpath = "//input[@type='radio']")
	private List <WebElement> rattingRadionBttn;
	
	@FindBy (xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reveiwThankYouMessage;
	//Methods 
	public void clickOnDesktopsTab() {
		desktopsTab.click();
	}
	public void clickOnShowAllDesktopsLink() {
		showAllDesktopsLink.click();
	}
	
	public List<WebElement> showDesktopItems(){
		List<WebElement> desktopItem= items; 
		return desktopItem;
	}
	public void clickOnAddToCartOptionHPLP3065ItemButton() {
		addToCartOptionOnHPLP3065Item.click();
	}
	public void selectQuantity(int quantity) {
		selectQuantity.clear();
		String quant = Integer.toString(quantity);
		selectQuantity.sendKeys(quant);
	}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public String getYouHaveAddedItToTheCartSuccessMessage() {
	String text =successMessage.getText();
	return text;
	}
	public void clickAddCanonEOS5DfromDeskToTheCart() {
		canonEOS5DItem.click();
	}
	public void selectRedColorFromDropdown() {
	//	WebElement colorDropDown = driver.findElement(By.xpath("//select[@id='input-option226']"));
	//	colorDropDown.click();
		////select[@id='input-option226']//child::option[@value='15'] 
		Select select = new Select (colorDropDown);
		select.selectByValue("15");
	}
	public String getYouHaveAddedCanonEOS5DCameraToYourCartText() {
		String text = canonEOS5DCameraSuccessMessage.getText();
		return text;
	}
	
	//Scenario 4
	public void clickOnCanon5DCameraLink () {
		canonEOS5DCameraLink.click();
	}
	public void clickOnWriteAReviewLink () {
		writeAReviewLink.click();
	}
	public void enterYourNameOnReviewTextField(String name) {
		yourName.sendKeys(name);
	}
	public void enterYourReviewTextField(String review) {
		yourReview.sendKeys(review);
	}
	// I am using List of WebElement
//	public void selectRatingOf5() {
//		ratingRadioButton5.click();
//	}
	public void selectRating1To5(String ratingValue){
		List<WebElement> ratingElements = rattingRadionBttn;
		for (WebElement element:ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
				
				
			}
		}
		
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getThankYouForYourReviewText(String thankYou) {
		String text =	reveiwThankYouMessage.getText();
		return text;
	}
}
