package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Roboclasss {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
@Test
public void open() throws Exception
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	WebElement buttonclick= driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
	buttonclick.click();
	fileupload("\"C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\USERMANUAL\\SELF INTRODUCTION.docx\"");
			
}
public void fileupload(String p) throws AWTException
{
	//selectfilepath
	StringSelection strseslection=new StringSelection(p);
	//copy to clipboard
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strseslection, null);

//to paste in sysytem windo we use robotclss
Robot robot=new Robot();
robot.delay(3000);
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 
 
 
 
 
 
 
 
 
 
 


}
}
