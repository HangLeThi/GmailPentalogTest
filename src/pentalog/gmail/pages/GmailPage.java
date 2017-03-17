package pentalog.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends AbtractPage {
	@FindBy(id = "Email")
	WebElement enterEmail;
	@FindBy(id = "next")
	WebElement clickNextbtn;
	@FindBy(id = "Passwd")
	WebElement enterPwd;
	@FindBy(id = "signIn")
	WebElement clickSignIn;
	@FindBy(id = "link-signup")
	WebElement linkSignup;
	public GmailPage(WebDriver driver) {
		super(driver);
	}

	public void enterEmailAddress(String value) {
		enterEmail.sendKeys(value);
	}

	public void clickNextbtn() {
		clickNextbtn.click();
	}

	public void enterPassword(String value) {
		enterPwd.sendKeys(value);
	}

	public WelcomeInboxGmail clickSignInbtn() {
		clickSignIn.click();
		return new WelcomeInboxGmail(driver);
	}



}
