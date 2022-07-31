package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.Objects.HomePageObject;

public class HomePageStepDefinition extends Base{

	HomePageObject homepageobject = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobject.clickOnCurrencyLink();
		logger.info("Currency link was clicked successfully");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobject.clickOnEuroLink();
		logger.info("Currency link was clicked successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageobject.showCurrencyAsEuro();
		logger.info("Currency value changed to Euro successfully");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageobject.clickOnShoppingCartButton();
		logger.info("Shopping cart was clicked successfully");
	}

	@Then("{string} message should display")
	public void message_should_display(String shoppingCartmessage) {
		homepageobject.showMessageYourShoppingCartIsEmpty(shoppingCartmessage);
		logger.info(shoppingCartmessage + " was displayed successfully");
	}
}
