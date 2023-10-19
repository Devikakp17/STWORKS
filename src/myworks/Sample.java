package myworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
	@BeforeTest
	  public void setup()
	  {
		  driver=new ChromeDriver();
		  //driver.get("https://www.spicejet.com/");
	  }
@Test
public void test1()
{
	driver.get("https://www.spicejet.com/");
    driver.findElement(By.cssSelector(".r-1jkjb > .css-76zvg2")).click();
    driver.findElement(By.cssSelector(".r-tmtnm0:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".r-tmtnm0:nth-child(2)")).sendKeys("7510817157");
    driver.findElement(By.cssSelector(".r-oxtfae:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".r-oxtfae:nth-child(1)")).sendKeys("Devika@2000");
    driver.findElement(By.cssSelector(".r-184aecr:nth-child(3)")).click();
}

}
