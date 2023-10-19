
import static org.junit.Assert.*;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LOGINTest {
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
  @Test
  public void lOGIN() {
    driver.get("https://www.spicejet.com/");
    driver.findElement(By.cssSelector(".r-1jkjb > .css-76zvg2")).click();
    driver.findElement(By.cssSelector(".r-tmtnm0:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".r-tmtnm0:nth-child(2)")).sendKeys("7510817157");
    driver.findElement(By.cssSelector(".r-oxtfae:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".r-oxtfae:nth-child(1)")).sendKeys("Devika@2000");
    driver.findElement(By.cssSelector(".r-184aecr:nth-child(3)")).click();
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
    driver.close();
  }
}
