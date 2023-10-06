package googleloading;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Xmlvaluepass {
	ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@Parameters({"titleverification"})
@Test
public void open(String titleverification)
{
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys(titleverification,Keys.ENTER);
}
}
