package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
     WebDriver driver;
     public DashboardPage(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements( driver,this);
    	 
     }
     
     @FindBy(xpath="//h6[text()=\"Dashboard\"]") WebElement Dashboard_Header;
     @FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]") WebElement DropDownUser;
 	@FindBy(xpath="//a[text()=\"Logout\"]") WebElement LogoutBtn;
 	@FindBy(xpath="//button[@title=\"Assign Leave\"]") WebElement AssignLeavebtn;
 	
      public boolean dashboardDisplay() throws InterruptedException {
    	 Thread.sleep(3000);
    	 boolean b =  Dashboard_Header.isDisplayed();
    	  return b;
         }
    	  public void dropDownClick() throws InterruptedException {
    		  Thread.sleep(3000);
    			DropDownUser.click();
    		}
    		public void logoutclick() throws InterruptedException {
    			Thread.sleep(3000);
    			LogoutBtn.click();
    		}
    	public void assignleaveBtn() throws InterruptedException {
    		Thread.sleep(5000);
    		AssignLeavebtn.click();
    	}
  
}
