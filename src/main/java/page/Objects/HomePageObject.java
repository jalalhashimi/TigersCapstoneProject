package page.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	//Scenario 1
	@FindBy (xpath = "//button[@data-toggle='dropdown']//span[text()='Currency']")
	private WebElement CurencyLink; 
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement euroLink;
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement CurencySignText;
	
	//Scenario 2
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement shoppingCartButton; 
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyShoppingCartMessage;
	
	//Scenario 1 Method
	public void clickOnCurrencyLink () {
		CurencyLink.click();
	}
	public void clickOnEuroLink () {
		euroLink.click();
	}
	public void showCurrencyAsEuro () {
		CurencySignText.isDisplayed();
	}
	//Scenario 2 Method
	public void clickOnShoppingCartButton () {
		shoppingCartButton.click();
	}
	public void showMessageYourShoppingCartIsEmpty (String string) {
		emptyShoppingCartMessage.isDisplayed();
	}
}
