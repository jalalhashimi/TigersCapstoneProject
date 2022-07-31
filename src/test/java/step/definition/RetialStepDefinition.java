package step.definition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.Objects.RetailPageObject;

public class RetialStepDefinition extends Base{
	RetailPageObject retailpageobject = new RetailPageObject();
	
	@Given ("User is on Retail website")
	public void User_is_on_Retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText= retailpageobject.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info(expectedText + " has been verified successfully");
	}
		@And("User click on MyAccount")
		public void user_click_on_my_account() {
			retailpageobject.clickOnMyAccountLink();
			logger.info("My account linked was clicked successfully");
		}
		@When("User click on Login")
		public void user_click_on_login() {
			retailpageobject.clickOnLoginLink();
			logger.info("Login was clicked successfully");
		}
		@And("User enter username {string} and password {string}")
		public void user_enter_username_and_password(String username, String password) {
			retailpageobject.enterEmail(username);
			retailpageobject.enterPassword(password);
			logger.info("Username and password was entered successfully");
		}
		@And("User click on Login button")
		public void user_click_on_login_button() {
			retailpageobject.clickLoginButton();
			logger.info("Login button was clicked successfully");
		}
		@Then("User should be logged in to MyAccount dashboard")
		public void user_should_be_logged_in_to_my_account_dashboard() {
			String expectedText = "Account";
			String actualText = retailpageobject.getMyAccountDashboardText();
			Assert.assertEquals(expectedText, actualText);
			logger.info("My Account Dashboard text has been verified successfully");
		}
		@When("User click on {string} link")
		public void user_click_on_link(String AffiliateAccout) {
			retailpageobject.clickOnRegisterForAnAffiliateAccount();
			logger.info(AffiliateAccout + " was clicked successfully");
		}
		@And("User fill affiliate form with below information")
		public void user_fill_affiliate_form_with_below_information(DataTable datatable) {
		   List <Map<String, String>> data = datatable.asMaps(String.class, String.class);
		   retailpageobject.enterCopanyName(data.get(0).get("company"));
		   retailpageobject.enterCopanyWebsite(data.get(0).get("website"));
		   retailpageobject.enterTaxID(data.get(0).get("taxID"));
		   retailpageobject.enterChequePayeeName(data.get(0).get("ChequePayeeName"));
		   retailpageobject.selectPaymentMethodRadioButton(data.get(0).get("paymentMethod"));
			logger.info("Information for company, website, taxID entered and radio button selected susccessfully");
		}	 
		@And("User check on About us check box")
		public void user_check_on_about_us_check_box() {
			retailpageobject.selectOnAboutUsCheckBox();
			logger.info("About us Checkbox selected successfully");
		}
		@And("User click on continue button")
		public void user_click_on_continue_button() {
			retailpageobject.clickOnContinueButton();
			logger.info("Continue button clicked successfully");
		}
		@Then("User should see a success message")
		public void user_should_see_a_success_message() {
			String exptectedSuccessText = "Success: Your account has been successfully updated.";
			String actualText = retailpageobject.getAccountSuccessMessage();
			Assert.assertEquals(exptectedSuccessText, actualText);
			logger.info("The success message has been verified successfully");
		}
		//2nd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		@When ("User click on Edit your affiliate information link")
		public void When_User_click_on_Edit_your_affiliate_information_link() {
			retailpageobject.clickOnEditYourAffiliateInfo();
			logger.info("Edit Affiliate Information link clicked successfully");
		}
		@And("user click on Bank Transfer radio button")
		public void user_click_on_bank_transfer_radio_button() {
			retailpageobject.clickOnBankTransferRadioButton();
			logger.info("Bank Transfer radio button selected successfully");
		}
		@And("User fill Bank information with below information")
		public void user_fill_bank_information_with_below_information(DataTable datatable) {
		   List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		   retailpageobject.enterBankName(data.get(0).get("bankName"));
		   retailpageobject.enterBankBranchNumber(data.get(0).get("abaNumber"));
		   retailpageobject.enterBankSwitftCode(data.get(0).get("swiftCode"));
		   retailpageobject.enterAccountName(data.get(0).get("accountName"));
		   retailpageobject.enterBankAccountNumber(data.get(0).get("accountNumber"));
		   logger.info("The above bank information was entered successfully");
		   
		}
		//3rd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		@When ("User click on Edit your account information link")
			public void User_click_on_Edit_your_account_information_link() {
			retailpageobject.clickOnEditYourAccountInformationLink();
			logger.info("Edit Account Information linked clicked successfully");
		}
		@And("User modify below information")
		public void user_modify_below_information(DataTable datatable) {
			 logger.info("Edit you account link was clicked successfully");
			 List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
			 retailpageobject.enterNewFirstName(data.get(0).get("firstname"));
			 retailpageobject.enterNewLastName(data.get(0).get("lastName"));
			 retailpageobject.enterNewEmailAddress(data.get(0).get("email"));
			 retailpageobject.enterNewTelephoneNumber(data.get(0).get("telephone"));
			 logger.info("User account has been modified with the above information successfully");
		}
		@Then("User should see a message {string}")
		public void user_should_see_a_message(String success) {
			retailpageobject.getAccountHasBeenSuccessfullyUpdatedText();
			logger.info(success + " Message was displayed successfully");
		}
}
