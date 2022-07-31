package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.Objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base{
	RetialStepDefinition retialstepdefinition = new RetialStepDefinition();
	LaptopNoteBooksPageObject laptopnotebookspageobject = new LaptopNoteBooksPageObject();
	//Scenario 1
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopnotebookspageobject.clickOnLaptopsAndNotebooks();
		logger.info("Laptop and NoteBook tab was clicked successfully");
	}
	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopnotebookspageobject.clickOnShowAllLaptopsAndNotebooks();
		logger.info("Show all Laptop and NoteBook tab was clicked successfully");
	}
	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopnotebookspageobject.clickOnMacBookItem();
		logger.info("Mac Book was clicked successfully");

	}
	@And("User should see {int} tem\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer numberOfItme, Double itemPrice) {
		laptopnotebookspageobject.showOneItemWithDollarAmount();
		logger.info(numberOfItme +  " and " + itemPrice + " are displayed successfully");
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopnotebookspageobject.clickonCartOptionDetails();
		logger.info("Cart option was clicked successfully");
	}
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopnotebookspageobject.clickXButtonToRemoveAnItem(); 
		logger.info("Red X button was clicked successfully");
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer number0) {
		laptopnotebookspageobject.showZeroItemWithZeroDollarAmount();
		logger.info("Cart item was removed and" + number0 +"varified successfully");
	}
	//Scenario 2
	
	
	
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String macBook) {
		laptopnotebookspageobject.clickOnCompareThisProductButtonforMacBook();
		logger.info(macBook + " clicked successfully");
		hardWait(2000);
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopnotebookspageobject.clickOnProductCompareLink();
		logger.info("Product coparsion link clicked successfully");
		hardWait(2000);
	}
	@Then("User should see Product Comparison Chart")
		public void user_should_see_product_comparison_chart()  {
		String expectedText = "Product Comparison";	
		String acutalText = laptopnotebookspageobject.productCompareChart();
		Assert.assertEquals(expectedText, acutalText);
			logger.info(acutalText + " chart was displayed successfully");
			hardWait(2000);
	}
	
	
	//Scenario 3
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String sonyVaio) {
		laptopnotebookspageobject.clickOnWishListButton();
		logger.info(sonyVaio + " is added to wishlist successfully");
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String message) {
		laptopnotebookspageobject.showYouMustCreateAnAccountToSaveItemToWishListMessage(message);
		logger.info(message + " is displayed successfully");
		
	}
	//Scenario 4
	
	@When("User click on {string} item")
	public void user_click_on_item(String macBookPro) {
		laptopnotebookspageobject.clickOnMacBookPro();
		logger.info(macBookPro + " was clicked successfully");
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String priceTag) {
		laptopnotebookspageobject.userCanSeeThePrice$2000();
		logger.info(priceTag + " Price was verified successfully");
	}

}
