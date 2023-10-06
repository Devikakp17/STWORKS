package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Marineforexdatepicking {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.marinersforex.com/Flights-Booking");
		
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/div/button")).click();
	
			
		WebElement yearelemenent=driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		
		String year=yearelemenent.getText();
		if(year.equals("2026"))
		{
			System.out.println("Year selected"+year);
			
		}
		else {
			yearelemenent.click();
		driver.findElement(By.xpath("//button[contains(text(),'2026')]")).click();
		}
		while(true) {
		
			String month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div")).getText();
			if(month.equalsIgnoreCase("Novemeber")) {
				System.out.println("Month selected="+month);
				break;
			}
		
			else
			{
				driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]")).click();
			}
			
		}
		List<WebElement>datelist=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button"));
		for(WebElement datele:datelist) {
			String date=datele.getText();
			if(date.equals("26")) {
				datele.click();
break;			}
		}
	}
}

