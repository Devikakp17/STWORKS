package handlingwindow;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ksrrtc {
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver =new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/");
	}
@Test
public void testv()
{
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	WebElement start=driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]"));
	start.sendKeys("KOZHIKODE");
//	Select from=new Select(start);
//	from.selectByValue("10072");
//	WebElement sear= driver.findElement(By.xpath("//*[@id=\"fromCity_chosen\"]/div/div/input"));
//	sear.sendKeys("tirur");
//	sear.click();
}
}
