package custWebdrivercmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import config.StartBrowser;

public class ActionDriver extends StartBrowser{

	/**
	 * Navigates to specified URL
	 * @param url --Application URL
	 */
	
	public static void launchUrl(String url)
	{
		driver.get(url);
		test.log(LogStatus.PASS, "Launched browser");
	}
	/**
	 * Perform click operation on buttons, links, Radio buttons and check boxes
	 * @param locator -Get it from OR
	 */
	public static void click(By locator)
	{
		driver.findElement(locator).click();
		test.log(LogStatus.PASS, "Click on Locator");
		
	}
	/**
	 * Perform type operation on text box
	 * @param locator --Get it from OR
	 * @param text --Hard code it or get it from Test data
	 */
	public static void type(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
		test.log(LogStatus.FAIL, "Click on Locator");
		
	}
	/**
	 * Select a value from dropdown using visibleText
	 * @param locator --Get it from OR
	 * @param selectByVisibleText --test data
	 */
	public static void selectByVisibleText(By locator, String selectByVisibleText)
	{
		WebElement dd=driver.findElement(locator);
		Select s = new Select(dd);
		s.selectByVisibleText(selectByVisibleText);
		
	}
}
