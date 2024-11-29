package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utilities.DataProviderLogin;

public class LoginTestCase extends TestBase {

  LoginPage  logobj;
  DashboardPage  dbp;
//  @Test(priority = 1)
//  public void testvalidLogin() throws InterruptedException {
//	  logobj = new LoginPage(driver);
//	  dbp = new DashboardPage(driver);
//	  
//	  //valid login 
//	  logobj.usernameEntering(prop.getProperty("usernamevalid"));
//	  logobj.passwordEntering(prop.getProperty("passwordvalid"));
//	  logobj.loginbtnClick();
//	  boolean b =  dbp.dashboardDisplay();
//	  dbp.dropDownClick();
//	  dbp.logoutclick();
//	  Assert.assertTrue(b);
//	  //Assert.assertEquals(b, true);
//  }
  @Test(priority=2 ,dataProvider = "testlogindataNegative" ,dataProviderClass = DataProviderLogin.class)
  public void testinvalidLogin(String uname,String password) throws InterruptedException {
	  logobj = new LoginPage(driver);
	  logobj.usernameEntering(uname);
	  logobj.passwordEntering(password);
	  logobj.loginbtnClick();
	  
	  String n = logobj.alertMsgText();
	  if (n.equals(prop.getProperty("invalidCredAlert")) || n.equals(prop.getProperty("blankCredAlert"))) {
		    Assert.assertTrue(true);
		} else {
		    Assert.fail();
		}

  }
//  @Test(priority=3)
//  public void testblankLogin() throws InterruptedException {
//	  logobj = new LoginPage(driver);
//	  logobj.usernameEntering(" ");
//	  logobj.passwordEntering(prop.getProperty("passwordvalid"));
//	  logobj.loginbtnClick();
//	  String s = logobj.blankAlert();
//	  Assert.assertEquals(s,prop.getProperty("blankCredAlert"));
//  }
}
