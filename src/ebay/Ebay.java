package ebay;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	

	 @BeforeTest
	  public void Open()
	  {
		  driver=new ChromeDriver();
		  driver.get("https://www.ebay.com/");
		  driver.navigate().refresh();
	
	

}
	 @Test
	 public void test() throws InterruptedException
	 {
		 driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("toys",Keys.ENTER);
		 String parentwindow=driver.getCurrentUrl();
		 driver.findElement(By.xpath("//*[@id=\"item4278680cf3\"]/div/div[2]/a/div/span")).click();
		 Set<String>allwindowhandles=driver.getWindowHandles();
			for(String handles:allwindowhandles)
			{
				if(!handles.equalsIgnoreCase(parentwindow))
					driver.switchTo().window(handles);
			
			}
			
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")).click();
			Thread.sleep(3000);
			//driver.navigate().to("https://www.ebay.com/");
			driver.navigate().to("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
			driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[2]/fieldset/span[1]/span[1]/span/span")).click();
			driver.findElement(By.xpath("//*[@id=\\\"firstname\\\"]")).sendKeys("DEVIKA");
			driver.findElement(By.xpath("//*[@id=\\\"lastname\\\"]")).sendKeys("kp");
			driver.findElement(By.xpath("//*[@id=\\\"Email\\\"]")).sendKeys("devikakp2013@gmail.com");
			driver.findElement(By.xpath("//*[@id=\\\"password\\\"]")).sendKeys("devika@2888");
			driver.findElement(By.xpath("//*[@id=\\\"EMAIL_REG_FORM_SUBMIT\\\"]")).click();
			
	 }
}