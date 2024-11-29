package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AsssignLeavePage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;

public class AssignLeaveTest extends TestBase{
	 DashboardPage dbp;
	 LoginPage logobj;
	AsssignLeavePage alp;
	 
	 @Test(priority=1)
	 public void testAssignleavePage() throws InterruptedException {
	   dbp = new DashboardPage(driver);
	   logobj = new LoginPage(driver);
	   alp = new AsssignLeavePage(driver);
	   logobj.usernameEntering(prop.getProperty("usernamevalid"));
	   logobj.passwordEntering(prop.getProperty("passwordvalid"));
	   logobj.loginbtnClick();
	   dbp.assignleaveBtn();
	   String Url = alp.getUrl();
	   Assert.assertEquals(Url, prop.getProperty("Assignleavepageurl"));
	 }
	 @Test(priority=2)
	 public void invalidemployeName() throws InterruptedException {
		 dbp = new DashboardPage(driver);
		   logobj = new LoginPage(driver);
		   alp = new AsssignLeavePage(driver);
		   alp.employeinvalidName(prop.getProperty("invalidemployeename"));
		   String errorMessage = alp.invalidMsgAlert();
	       Assert.assertEquals(errorMessage,"No Records Found");
	        
	    }
	 }

