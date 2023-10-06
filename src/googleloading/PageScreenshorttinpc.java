package googleloading;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PageScreenshorttinpc {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test
public void test() throws Exception
{
	driver.get("https://www.amazon.com");
	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sc,new File("C:\\Users\\ASUS\\Pictures\\Screenshots\\amazonsn.png"));
}
}
