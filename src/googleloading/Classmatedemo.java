package googleloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classmatedemo {
	WebDriver driver;
	 @BeforeTest
	 public void open()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.classmateshop.com/");
	 }
@Test
public void test11() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/p")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div/div[1]/div/div/input")).sendKeys("7510817157");
}

}