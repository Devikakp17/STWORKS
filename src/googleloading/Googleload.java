package googleloading;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googleload {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
