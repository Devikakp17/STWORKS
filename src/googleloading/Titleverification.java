package googleloading;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String acttitle=driver.getTitle();
String exptitle="Google";
if(acttitle.equals(exptitle))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
