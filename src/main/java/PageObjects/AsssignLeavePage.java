package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsssignLeavePage {
 
	WebDriver driver;
	public AsssignLeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//input[@placeholder=\"Type for hints...\"]") WebElement Employename;
	@FindBy(xpath="//div[@class=\"oxd-autocomplete-option\"]") WebElement InvalidText;
	
	
	public String getUrl() throws InterruptedException {
		Thread.sleep(3000);
		String URL = driver.getCurrentUrl();
		return URL;
		
	}
	public void employeinvalidName(String emname) throws InterruptedException {
		Thread.sleep(3000);
		Employename.sendKeys(emname);
	}
	public String  invalidMsgAlert() throws InterruptedException {
		Thread.sleep(3000);
		String ms = InvalidText.getText();
		return ms;
	}
	
	
}
