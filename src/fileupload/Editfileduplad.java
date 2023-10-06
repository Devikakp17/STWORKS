package fileupload;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Editfileduplad {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
@Test
public void open() throws Throwable
{
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	Roboclasss rb=new Roboclasss();
	rb.fileupload("\"C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\DEVIKA KP\\Devika kp.pdf\"");

	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}
