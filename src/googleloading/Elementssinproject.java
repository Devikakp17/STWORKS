package googleloading;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Elementssinproject {
	ChromeDriver driver;
	@Before
public void setUp()
{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		}
	@Test
	public void test()throws Exception
	{
			WebElement amazonicon =driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));{
			File ac=amazonicon.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ac, new File("./SCREENSHORT/Amzoniconn.png"));
			
			
				
	}
}
}