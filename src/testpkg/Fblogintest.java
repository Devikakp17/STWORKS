package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.Openbrowser;
import pagepkg.Fbloginpage;

public class Fblogintest extends Openbrowser {

	

@Test
public void login()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setValues("abcde@gmail.com", "123ed");
	ob.loginclick();
	driver.navigate().back();
	
}
	
	
}
