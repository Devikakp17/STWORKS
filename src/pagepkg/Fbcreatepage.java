package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	
@FindBy(xpath="//a[@class='_8esh']")WebElement createpagelink;
@FindBy (xpath="//div[@class='_43rm']")WebElement getstartedbutton;
	
public Fbcreatepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	
	public void createPageClick()
	{
		(createpagelink).click();
	}
	public void getStartedButton() {
		
	
		(getstartedbutton).click();
	}
	
	
	

}
