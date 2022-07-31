package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.Objects.DesktopPageObject;

public class DesktopPageStepDefinition extends Base{
	RetialStepDefinition retialstepdefinition = new RetialStepDefinition();
	DesktopPageObject desktoppageobject = new DesktopPageObject();
	
	// Scenario 1 ++++++++++++++++++++++++
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppageobject.clickOnDesktopsTab();
		logger.info("Desktop tab was clicked successfully");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppageobject.clickOnShowAllDesktopsLink();
		logger.info("All Desktops linked was clicked successfully");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List <WebElement> desktopElement = desktoppageobject.showDesktopItems();
		for(WebElement element:desktopElement) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is present");
			
		}
		
	}
	// Scenario 2 ++++++++++++++++++++++++
	@And("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppageobject.clickOnAddToCartOptionHPLP3065ItemButton();
		logger.info("Option for HP LP3065 was clicked successfully");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer addQuantity) {
		desktoppageobject.selectQuantity(addQuantity);
		logger.info("Quantity was entered successfully");
	}


	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoppageobject.clickOnAddToCartButton();
		logger.info("Add to the cart clicked successfully");
		retialstepdefinition.user_should_see_a_message(desktoppageobject.getYouHaveAddedItToTheCartSuccessMessage());
		//here User should see Success: ... message
	}
	
	
//	// Scenario 3 ++++++++++++++++++++++++
	@And("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoppageobject.clickAddCanonEOS5DfromDeskToTheCart();
		logger.info("Cannon EOS 5D clicked and added to the cart successfully");
	}

	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktoppageobject.selectRedColorFromDropdown();
		logger.info("Red color was selected successfully");
	//	user_click_add_to_cart_button();
	//here User should see Success: ... message	
	}
	
	
	
//	// Scenario 4 ++++++++++++++++++++++++
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoppageobject.clickOnCanon5DCameraLink();
		logger.info("Canon EOS 5D was clicked successfully");
	}
	
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoppageobject.clickOnWriteAReviewLink();   
		logger.info("Write a review link was clicked successfully");
	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable datatable) {
		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		desktoppageobject.enterYourNameOnReviewTextField(data.get(0).get("yourname"));
		desktoppageobject.enterYourReviewTextField(data.get(0).get("yourReview"));
		desktoppageobject.selectRating1To5(data.get(0).get("Rating"));
		logger.info("Review text fields were filled with the given information successfully");
		
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktoppageobject.clickOnContinueButton();  
		logger.info("Continue button was clicked successfully");
	}

	@Then("User should see a message with {string}")
	public void  user_should_see_a_message_with(String text) {
	 desktoppageobject.getThankYouForYourReviewText(text);
	 logger.info(text + " is displayed successfully");
	 
	}
}
