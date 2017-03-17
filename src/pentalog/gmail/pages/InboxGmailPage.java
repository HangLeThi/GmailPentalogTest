package pentalog.gmail.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxGmailPage extends AbtractPage {
	public Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	WebElement lastestEmail = driver.findElement(By
			.id("//span[contains(text(),'SubTitle:')]"));
	WebElement emailContent = driver.findElement(By
			.xpath("//div[contains(text(),'Content:')]"));
	
	
	public InboxGmailPage(WebDriver driver) {
		super(driver);
	}

	public void openTheLastestInboxEmail() {
		lastestEmail.click();
	}

	public String readTheEmailContent() {
		return emailContent.getText();
		}

	public void printEmailContent() {
		System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		APP_LOGS.debug("Noi dung email la:" + emailContent);
	}
	public void closeEmailInboxPage(){
		driver.quit();
	}
}
