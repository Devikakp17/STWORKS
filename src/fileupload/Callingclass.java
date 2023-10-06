package fileupload;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Callingclass {
	WebDriver driver;

	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
	public void url()
	{
		driver.get("https://demo.automationtesting.in/FileUpload.html");
	}
@Test

public void tt() throws AWTException 
{
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/div[3]")).click();
		Roboclasss rb=new Roboclasss();
		rb.fileupload("\"C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\ST Notes\\Management luminarmarch_4064532_2023_05_30_20_49.docx.pdf\"");
}
}