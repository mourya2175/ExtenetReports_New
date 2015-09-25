package config;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class StartBrowser {
	
	public static WebDriver driver;
	static Date dNow = new Date( );
    //static SimpleDateFormat ft = new SimpleDateFormat ("dd_MM_yyyy(h:mm)");
//	static SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MMMMM.dd GGG hh:mm aaa");
	static SimpleDateFormat ft = new SimpleDateFormat("ddMMyy_HHmmss");
	public static ExtentReports extent = new ExtentReports("report/rep"+ft.format(dNow)+".html", false);
	public static ExtentTest test;
	//public static ExtentTest test = extent.startTest("Test Name", "Sample description");
	
	public void setTestDesc(String name, String desc){
		test = extent.startTest(name, desc);
	}
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	}

	@AfterClass
	public void afterClass() {
		extent.flush();
		driver.quit();
		
		
		
		
		 
	}
	

}
