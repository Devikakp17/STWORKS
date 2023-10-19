import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TILLSEARCHCLICKTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterTest
  public void tearDown() {
    driver.quit();
  }
  @org.testng.annotations.Test
  public void tILLSEARCHCLICK() {
    driver.get("https://www.spicejet.com/");
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > div:nth-child(1) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > div:nth-child(1) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8")).sendKeys("Kozhikode (CCJ)");
    driver.findElement(By.cssSelector("div:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8:nth-child(1)")).sendKeys("DUB");
    {
      WebElement element = driver.findElement(By.cssSelector(".active .carousel-img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,56)");
    driver.findElement(By.cssSelector(".r-1g94qm0:nth-child(1)")).click();
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.cssSelector(".r-ymttw5"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".r-ymttw5"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".r-ymttw5"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".r-1loqt21:nth-child(1) > .r-1b43r93")).click();
    driver.close();
  }
}
