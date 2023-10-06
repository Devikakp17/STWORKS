package myworks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fileupload.Roboclasss;

public class Fup {
	
	WebDriver driver;

	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	}
	@Test
	public void testing() throws Exception
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]")).click();
		
	 fileupload("\"C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\DEVIKA KP\\Assessment Sheet UOM-Results (1).pdf\"");
				

	}
	public void fileupload(String p) throws AWTException
	{
		//to copy path to clipboard
		
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//to paste into systemwindow//
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	
	
	
	
	

	}


