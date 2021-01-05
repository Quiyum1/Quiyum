package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class GoogleSearchTest {

	private static WebDriver driver =null; 


	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch () throws InterruptedException{

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver88");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		GoogleSearchPage.textbox_search(driver).sendKeys("hello bangladesh");
		Thread.sleep(5000);

		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.close();

		System.out.println("Test Completed Successfully");

	}
}
