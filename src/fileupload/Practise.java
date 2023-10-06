package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practise {
	WebDriver driver;
	
	@BeforeTest
	public void opp() 
	{
	driver=new ChromeDriver();
		driver.get(" https://blueimp.github.io/jQuery-File-Upload/ ");
	}
	@Test
	public void sss()throws AWTException
	{
		
	driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]")).click();
	
		//Roboclasss rb=new Roboclasss();
		//rb.fileupload("\"C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\DEVIKA KP\\Assessment Sheet UOM-Results (1).pdf\"");
		fileupload("\"C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot (3).png\"");
		
	}
	public void fileupload(String p) throws AWTException
	{
		StringSelection strseslection=new StringSelection(p);
//		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strseslection, null);
//
//	//to paste in sysytem windo we use robotclss
Robot robot=new Robot();
robot.delay(3000);
	 robot.keyPress(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_V);
	 robot.keyRelease(KeyEvent.VK_CONTROL);
	 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
	 

}}
