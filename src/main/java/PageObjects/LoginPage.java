package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	
	WebDriver driver ;
	public  LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement Login_btn;
	@FindBy(xpath ="//input[@name=\"username\"]") WebElement Username_Field;
	@FindBy(xpath ="//input[@name=\"password\"]") WebElement Password_Field;
	@FindBy(xpath="//p[text()=\"Invalid credentials\"]") WebElement Alert_Msg;
	@FindBy(xpath="//span[text()=\"Required\"]") WebElement Required_msg;
	
   
	public void loginbtnClick() {
		Login_btn.click();
	}
	public void usernameEntering(String username ) throws InterruptedException {
		Thread.sleep(3000);
		Username_Field.sendKeys(username);
	}
	public void passwordEntering(String password) throws InterruptedException {
		Thread.sleep(3000);
		Password_Field.sendKeys(password);
	}
	public String alertMsgText() throws InterruptedException {
		Thread.sleep(3000);
		String m = Alert_Msg.getText();
		return m;
	}
	public String blankAlert() throws InterruptedException {
		Thread.sleep(3000);
		String s = Required_msg.getText();
		return s;
	}
	
}
