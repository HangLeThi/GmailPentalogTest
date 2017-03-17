package pentalog.gmail.test;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pentalog.gmail.pages.GmailPage;
import pentalog.gmail.pages.InboxGmailPage;
import pentalog.gmail.pages.WelcomeInboxGmail;

public class GmailTestCase {
	WebDriver driver;
	GmailPage gmailPage;
	InboxGmailPage inboxGmailPage;
	WelcomeInboxGmail welcomeGmailPage;
	public Logger APP_LOGS = Logger.getLogger("devpinoyLogger");

	@Before
	public void beforeTest() {
		/*System.setProperty("org.apache.commons.logging.Log",
				"org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("webdriver.chrome.driver",
				"C:/Chrome/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);*/
		System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("webdriver.gecko.driver",
				"E:/SeleniumUsers/geckodriver-v0.10.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		gmailPage=new GmailPage(driver);
		inboxGmailPage=new InboxGmailPage(driver);
		welcomeGmailPage=new WelcomeInboxGmail(driver);
	}

	@Test
	public void signIntoInboxGmailAndPrintEmailContent() {
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		gmailPage.enterEmailAddress("hanglt001.buitech@gmail.com");
		gmailPage.clickNextbtn();
		gmailPage.enterPassword("buitech123");
		gmailPage.clickSignInbtn();
		welcomeGmailPage.clickOnGmailIcon();
		inboxGmailPage.openTheLastestInboxEmail();
		inboxGmailPage.printEmailContent();
		}
	
	@After
	public void afterTest(){
		inboxGmailPage.closeEmailInboxPage();
	}
	
}