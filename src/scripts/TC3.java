package scripts;

import or.RegPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import reuse.Businessfns;
import util.Xls_Reader;

public class TC3 extends Businessfns{
	
	Xls_Reader reader = new Xls_Reader("testdata//data.xlsx");
  @Test
  public void testTC3() throws Exception {
	  try {
		//extent.startTest("testTC3");
		  setTestDesc("testTC3", "testTC3");
		  register();
		  type(RegPage.txtFn, reader.getCellData("Sheet1", "FirstName", 2));
		  type(RegPage.txtLn, reader.getCellData("Sheet1", "LastName", 2));
		  type(RegPage.txtEmail, reader.getCellData("Sheet1", "Email", 2));
		  selectByVisibleText(RegPage.ddHear, reader.getCellData("Sheet1", "About", 2));
		  click(RegPage.btnContinue);
		  String msg=driver.findElement(RegPage.msgErr).getText();
		  Assert.assertEquals(msg, "This is a required field.");
		  System.out.println("this is for testing");
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
