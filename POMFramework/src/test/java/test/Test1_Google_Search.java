package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1_Google_Search {

	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch () {// throws InterruptedException{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver88");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
	
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		//Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);
		//Thread.sleep(5000);
		
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
	}
}
