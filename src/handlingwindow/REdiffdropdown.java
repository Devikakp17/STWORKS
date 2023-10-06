package handlingwindow;

//import java.util.List;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class REdiffdropdown {
ChromeDriver driver;
@BeforeMethod
public void setup()
{
	driver=new ChromeDriver();
}
@Test
public void testt()
{
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	WebElement dayt=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select dayde=new Select((dayt));
	dayde.selectByValue("01");
	
	
}
}
