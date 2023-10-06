//package googleloading;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class Demo {
//	WebDriver driver;
//	 @BeforeTest
//	 public void openn()
//	 {
//		 driver=new ChromeDriver();
//		 driver.get("https://demo.automationtesting.in/Index.html");
//		 driver.manage().window().maximize();
//	 }
//	 @Test
//	 public void test1() throws InterruptedException
//	 
//	 {
//		 driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/span/a")).click();
//		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("DEVIKA");
//		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("KP");
//		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("KINATTERI PARAMBIL HOUSE VETTOM,TIRUR MALAPPURAM,KERALA");
//	     driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("devikakp2013@gmail.com");
//	     driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7510817157");
//	     driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
//	     driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
//	     driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
//	     driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
//	     List<WebElement> langlist=driver.findElements(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul"));
//	     for(int i=0;i<=langlist.size();i++)
//	     {
//	    	 String text=langlist.get(i).getText();
//	    	 System.out.println("text is"+text);
//	    	 if(text.contains("English"))
//				{
//	    	 langlist.get(i).click();
//	    	 break;
//	     }
//	     
//	 }
//	 
//	WebElement skill= driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
//	 Select ss=new Select(skill);
//	 Thread.sleep(3000);
//	 ss.selectByVisibleText("English");
//	 
//	 
//
//}}
