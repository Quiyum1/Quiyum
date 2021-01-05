import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserCheck {

	public static void main(String[] args) throws InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"//Drivers/LatestGeckoDriver");
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver88");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");


		driver.findElement(By.name("q")).sendKeys("hello bangladesh");
		List<WebElement> listOfInputElements = driver.findElements(By.name("//q"));
		int count = listOfInputElements.size();
		System.out.println("count of input elements: "+count);

		Thread.sleep(4000);  //we could use try & catch as well. 
		
		driver.close();


	}

}
