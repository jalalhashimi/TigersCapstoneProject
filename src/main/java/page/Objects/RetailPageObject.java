package page.Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
public class RetailPageObject extends Base{

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	@FindBy (xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginLink;
	@FindBy (id = "input-email")
	private WebElement enterEmail;
	@FindBy (id = "input-password")
	private WebElement enterPassword;
	@FindBy (xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;
	@FindBy (xpath = "//a[text()='Account']")
	private WebElement myAccountDashboardText;
	@FindBy (xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;
	@FindBy (xpath = "//input[@id='input-company']")
	private WebElement companyName;
	@FindBy (xpath = "//input[@id='input-website']")
	private WebElement websiteName;
	@FindBy (xpath = "//input[@id='input-tax']")
	private WebElement taxID;
	
//	@FindBy (xpath = "//input[@type='radio' and @value='cheque']")
//	private WebElement chequeRadioBtton;
	@FindBy (xpath = "//input[@type='radio']")
	private List<WebElement> paymentMethodRadioBttn;
	
	@FindBy (xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeNameTextField;
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement aboudUsCheckBox;
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continueButton;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	//2nd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@FindBy (xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInformation;
	@FindBy (xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioBttn;
	@FindBy (id = "input-bank-name")
	private WebElement bankNameTextField;
	@FindBy (id = "input-bank-branch-number")
	private WebElement abaNumberTextField;
	@FindBy (id = "input-bank-swift-code")
	private WebElement swifitCodField;
	@FindBy (id = "input-bank-account-name")
	private WebElement accoutnNameField ;
	@FindBy (id = "input-bank-account-number")
	private WebElement accoutnNumberField ;
	//3rd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@FindBy (xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation ;
	@FindBy (id = "input-firstname")
	private WebElement firstName;
	@FindBy (id = "input-lastname")
	private WebElement lastName;
	@FindBy (id = "input-email")
	private WebElement newEmail;
	@FindBy (id = "input-telephone")
	private WebElement newTelephone;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement accoutUpdatedSuccessText;
	public String getTestEnvironmentText() {
		String text = testEnvironmentText.getText();
		return text;
	}
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void enterEmail(String userName) {
		enterEmail.sendKeys(userName);
	}
	public void enterPassword(String userPassword) {
		enterPassword.sendKeys(userPassword);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public String getMyAccountDashboardText() {
		String text = myAccountDashboardText.getText();
		return text;
	}
	public void clickOnRegisterForAnAffiliateAccount() {
		registerForAnAffiliateAccount.click();
	}
	public void enterCopanyName(String company) {
		companyName.sendKeys(company);
	}
	public void enterCopanyWebsite(String companywebsite) {
		websiteName.sendKeys(companywebsite);
	}
	public void enterTaxID(String taxIDNo) {
		taxID.sendKeys(taxIDNo);
	}
	public void selectPaymentMethodRadioButton(String paymentMethod) {
		List<WebElement> paymentMethodList = paymentMethodRadioBttn;
		for (WebElement element: paymentMethodList) {
			if(element.getAttribute("value").equalsIgnoreCase(paymentMethod.trim())){
				element.click();
				break;
			}
		}
		
		//chequeRadioBtton.click();
	}
	public void enterChequePayeeName(String chequeTxtField) {
		chequePayeeNameTextField.sendKeys(chequeTxtField);
	}
	public void selectOnAboutUsCheckBox() {
		aboudUsCheckBox.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getAccountSuccessMessage() {
		String text = successMessage.getText();
		return text;
	}
	//2nd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void  clickOnEditYourAffiliateInfo() {
		editYourAffiliateInformation.click();
	}
	public void  clickOnBankTransferRadioButton() {
		bankTransferRadioBttn.click();
	}
	public void  enterBankName(String bank) {
		bankNameTextField.sendKeys(bank);
	}
	public void  enterBankBranchNumber(String branchNumber) {
		abaNumberTextField.sendKeys(branchNumber);
	}
	public void  enterBankSwitftCode(String SwiftCode) {
		swifitCodField.sendKeys(SwiftCode);
	}
	public void  enterAccountName(String accountName) {
		accoutnNameField.sendKeys(accountName);
	}
	public void  enterBankAccountNumber(String accountNumber) {
		accoutnNumberField.sendKeys(accountNumber);
	}
	//3rd Scenario ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void  clickOnEditYourAccountInformationLink() {
	editYourAccountInformation.click();
	}
	public void  enterNewFirstName(String name) {
		firstName.clear();
		firstName.sendKeys(name);
		}
	public void  enterNewLastName(String last) {
		lastName.clear();
		lastName.sendKeys(last);
		
		}
	public void  enterNewEmailAddress(String email) {
		newEmail.clear();
		newEmail.sendKeys(email);

		}
	public void  enterNewTelephoneNumber(String telephone) {
		newTelephone.clear();
		newTelephone.sendKeys(telephone);
		}
	public void getAccountHasBeenSuccessfullyUpdatedText() {
				accoutUpdatedSuccessText.getText();
	}
	
}
