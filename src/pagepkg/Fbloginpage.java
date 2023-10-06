package pagepkg;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
//	By fbemail=By.id("email");
//	By fbpaswrd=By.id("pass");
//	By fblogin=By.name("login");
	
	
	
	
	@FindBy(id="email")WebElement fbemail;
	@FindBy(id="pass")WebElement fbpaswrd;
	@FindBy(name="login")WebElement fblogin;
	
	
   public Fbloginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}


   public void setValues(String email,String password)
{
	fbemail.sendKeys(email);   //when using finby remove driver.finelements here.for easy way to locate.
    fbpaswrd.sendKeys(password);
}
   public void loginclick()
{
	fblogin.click();
}

}