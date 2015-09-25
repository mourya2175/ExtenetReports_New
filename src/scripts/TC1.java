package scripts;

import or.HomePage;

import org.testng.annotations.Test;

import com.github.yev.FailTestScreenshotListener;

import custWebdrivercmds.ActionDriver;

@org.testng.annotations.Listeners(FailTestScreenshotListener.class)
public class TC1 extends ActionDriver{
	
  @Test
  public void testTC1() throws Exception {
	  //extent.startTest("testTC1");
	  setTestDesc("testTC1", "testTC1");
	  launchUrl("http://www.rightstart.com/");
	  click(HomePage.lnkSignIn);
	 
	  /*click(LoginPage.btnContinue);
	  type(RegPage.txtFn, "Webdriver");
	  
	 
	  Thread.sleep(3000);*/
	  extent.endTest(test);
	 
  }
}
