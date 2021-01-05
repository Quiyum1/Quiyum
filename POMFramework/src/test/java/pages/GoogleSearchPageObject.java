package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	/*
	 * THE DRIVER IS USED ON LINE 13, BUT WHEN LINE 15&16 WILL BE CALLED FROM 
	 * THE TEST CASE, I SHOULD BE USING THE DRIVER INSTANCE FROM THE 
	 * TEST CASE. NOT FROM THIS CLASS.OTHERWISE, IT WON'T DO ANY ACTIONS. 
	 * SO SOLVE THIS PROBLEM, I WILL CREATE A CONSTRUCTOR ON LINE 21.
	 * I WILL PASS THE VALUE IN PARAMETER (WebDriver driver) WEBDRIVER INSTANCE 
	 * FROM THE CALLING CLASS. WHEREVER I WILL CREATE AN OBJECT FOR THIS CLASS,
	 * THIS CONSTRUCTOR WILL BE CALLED. AND WHEN EVER I CREATE AN OBJECT OF THIS CLASS, 
	 * I SHOULD PASS A DRIVER INSTANCE OR A WEBDRIVER INSTANCE. WHICH WILL COME HERE. 
	 * THIS.DRIVER = DRIVER 
	 */
	
	WebDriver driver = null;
	//OBJECTS 
	By textbox_search = (By.name("q"));
	By button_search = (By.xpath("(//input[@name='btnK'])[2]"));
	
	public GoogleSearchPageObject(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//ACTIONS/METHODS
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
}
