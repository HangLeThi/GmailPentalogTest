/*package test.gmail.pentalog;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginIntoGmail {
	WebDriver driver;
	
	public Logger APP_LOGS=Logger.getLogger("devpinoyLogger");

	@Before
	public void openGmailPage() {
		// System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.Jdk14Logger");
		System.setProperty("webdriver.chrome.driver",
				"C:/Chrome/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();

	}

	@Test
	public void logintoGmail() {
		driver.findElement(By.id("Email")).sendKeys(
				"hanglt001.buitech@gmail.com");
		driver.findElement(By.id("next")).click();
		WebDriverWait psswd = new WebDriverWait(driver, 100);
		psswd.until(ExpectedConditions.visibilityOfElementLocated(By
				.id("Passwd")));
		driver.findElement(By.id("Passwd")).sendKeys("buitech123");
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.className("WaidBe")).click();
		driver.findElement(By.xpath("//*[@id=':31']/tbody/tr[1]")).click();
		 String myText = driver.findElement(By.className("m15ad64079b2d5f93")).getText();
		 APP_LOGS.debug(myText);
		//System.out.println(myText);
	}
	//div[@class='gs']/div[2]/div/div a3s aXjCH 
	@After
	public void closeBrowser() {
		// driver.close();
	}
}*/
