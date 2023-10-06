package testpkg;

//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.Openbrowser;
import pagepkg.Fbcreatepage;

public class Createtest extends Openbrowser{
	@Test
	public void createpage()
	{
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.createPageClick();
		ob1.getStartedButton();
	}

}
