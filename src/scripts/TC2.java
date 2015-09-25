package scripts;

import or.RegPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import reuse.Businessfns;

public class TC2 extends Businessfns{
  @Test
  public void testTC2() throws Exception {
	  //extent.startTest("testTC2");
	  try
	  {
	  setTestDesc("testTC2", "testTC2");
	  register();
	  type(RegPage.txtFn, "Webdriver");
	  type(RegPage.txtLn, "Selenium");
	  type(RegPage.txtEmail, "Webdriver@xyz.com");
	  selectByVisibleText(RegPage.ddHear, "Family");
	  click(RegPage.btnContinue);
	  String msg=driver.findElement(RegPage.msgErr).getText();
	  Assert.assertEquals(msg, "This is a required field.");
	  Thread.sleep(3000);
  } catch (Exception e) {
		// TODO: handle exception
		throw new Exception(e);
	}
	  finally
	  {
		  extent.endTest(test);  
		  
	  }
	 
  }
}
