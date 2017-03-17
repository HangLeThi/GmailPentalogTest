package pentalog.gmail.pages;

import org.openqa.selenium.WebDriver;

public class AbtractPage {
	protected WebDriver driver;

	public AbtractPage(WebDriver driver) {
		this.driver = driver;
	}

	public GmailPage navigateToGmailUrl() {
		driver.navigate().to("https://accounts.google.com");
		return new GmailPage(driver);

	}


}
