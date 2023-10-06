package googleloading;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgrm {
	ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/");
	}
@Test
public void test()
{//softassertion
	String act=driver.getTitle();
	String exp="Guru99";
//	if(act.equals(exp))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
	
//	}
	//hard assertion
	Assert.assertEquals(act, exp,"title verifiied");
	System.out.println("title verified");

}
}
