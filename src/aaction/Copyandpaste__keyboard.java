package aaction;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copyandpaste__keyboard {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void testt()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fn=driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		fn.sendKeys("devikakp");
		WebElement iid=driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		Actions act=new Actions(driver);
		act.keyDown(fn,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);//select
		act.keyDown(fn,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(iid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		//id.sendKeys()

}
	




}

