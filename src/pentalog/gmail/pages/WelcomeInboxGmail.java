package pentalog.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomeInboxGmail extends AbtractPage {
	
	public WelcomeInboxGmail(WebDriver driver) {
		super(driver);
	}
	WebElement clickGmailIcon = driver.findElement(By.id("WaidBe"));
	public InboxGmailPage clickOnGmailIcon() {
		clickGmailIcon.click();
		return new InboxGmailPage(driver);
	}
}
