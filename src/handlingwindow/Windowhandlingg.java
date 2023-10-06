package handlingwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Windowhandlingg {
	
	WebDriver driver;
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
String parentwindow=driver.getCurrentUrl();
		
	driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String>allwindowhandles=driver.getWindowHandles();
		for(String handles:allwindowhandles)
		{
			if(!handles.equalsIgnoreCase(parentwindow))
				driver.switchTo().window(handles);
			driver.close();
		}
		driver.switchTo().window(parentwindow);
	}
	

}
