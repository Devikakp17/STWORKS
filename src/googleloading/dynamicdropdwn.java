package googleloading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicdropdwn {
	
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException 
	{
		
driver.findElement(By.xpath("//*[@id=\"SW\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("kozhikode");
	Thread.sleep(3000);
 List<WebElement>datalist1=driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul"));
		
		for(int i=0;i<=datalist1.size();i++)
		{
				String text=datalist1.get(i).getText();
				System.out.println("text is"+text);
				if(text.contains("Kozhikode"))
				{
					datalist1.get(i).click();
					break;
				}
		}
		
	}
	

}