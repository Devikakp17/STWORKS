package extentreport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basepkg.Screenshotcode;



public class Fbextendreport {
	WebDriver driver;
	String burl="https:www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports reportss;
	@BeforeTest
	public void bftest()
	{
		reporter=new ExtentHtmlReporter("./ExtentReports/report1.html");
		reporter.config().setDocumentTitle("FB LOGIN AUTOMATION REPORT");
		reporter.config().setReportName("FuctionalTest");
		reporter.config().setTheme(Theme.DARK);
		reportss=new ExtentReports();
		reportss.attachReporter(reporter);
		reportss.setSystemInfo("hostname", "localname");
		reportss.setSystemInfo("os","Windows11" );
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void setUp()
	{
		driver.get(burl);
	}
@Test
public void test1()
{
	test=reportss.createTest("FB TITLE VERIFICATION");
	String exp="Facebook";
	String act=driver.getTitle();
	Assert.assertEquals(exp, act);
}
//@Test
//public void test2() {
//	test=reportss.createTest("FB LOGO VERIFICATION");
//	WebElement b=driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div/div/div[1]/div/img"));
//	Assert.assertFalse(b);
//}
@AfterTest
public void tearDown()
{
reportss.flush();	
}
@AfterMethod
public void generateReport(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "Test case failed because"+result.getName());
		test.log(Status.FAIL,"Test case failed because"+result.getThrowable());
		String screenshotpath=Screenshotcode.screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "Test case skipped because"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "Test case passed because"+result.getName());
	}
	}
}



