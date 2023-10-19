
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FLIGHTSEARCHINGTest {
  public static WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void fLIGHTSEARCHING() {
    driver.get("https://www.spicejet.com/");
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > div:nth-child(1) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > div:nth-child(1) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8")).sendKeys("Kozhikode (CCJ)");
    driver.findElement(By.cssSelector("div:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8:nth-child(1)")).click();
    driver.findElement(By.cssSelector("div:nth-child(3) > .css-1dbjc4n > .css-1dbjc4n > .css-1cwyjr8:nth-child(1)")).sendKeys("dub");
    driver.findElement(By.cssSelector(".css-1dbjc4n > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(2) > svg")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(2) > svg")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n > div:nth-child(1) > .css-1dbjc4n > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n:nth-child(2) > svg")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .r-1awozwy:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".r-19h5ruw > div > .r-11u4nky")).click();
    driver.findElement(By.cssSelector(".r-d9fdf6")).click();
    driver.findElement(By.cssSelector(".r-1loqt21:nth-child(1) > .r-1b43r93")).click();
    driver.findElement(By.cssSelector(".r-1ap4h1l > .css-1dbjc4n")).click();
    driver.findElement(By.cssSelector(".r-z2wwpe:nth-child(4)")).click();
    driver.findElement(By.cssSelector(".r-11wnrd2")).click();
    driver.findElement(By.cssSelector(".r-1loqt21:nth-child(1) > .r-1b43r93")).click();
    driver.findElement(By.cssSelector(".r-3395yf")).click();
    driver.findElement(By.cssSelector(".r-hko4rg")).click();
    driver.findElement(By.cssSelector(".r-1xfd6ze:nth-child(2)")).click();
    driver.findElement(By.cssSelector("body")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("body"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-1x93onp svg")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("DEVIKA");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("KP");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("7510817157");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("devikakp2013@gmail.com");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("tirur");
    driver.findElement(By.cssSelector(".r-15xlf49 > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".r-6ncur5")).click();
    driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.cssSelector(".r-15xlf49 > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(16) > .r-19m6qjp")).click();
    driver.findElement(By.cssSelector(".r-1kb76zh .r-p1pxzi")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys(Keys.UP);
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("UWERRWUWJWJ");
    driver.findElement(By.cssSelector("#pax-item-MSFBRFQ- > .css-1dbjc4n")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("DEVANATH");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("KP");
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".r-hrhsj0"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".r-edyy15 > .css-1dbjc4n > .css-1dbjc4n:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".r-hrhsj0"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".r-hrhsj0"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("751018157");
    driver.findElement(By.cssSelector(".r-15xlf49 > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".r-6ncur5")).click();
    driver.findElement(By.cssSelector(".r-15xlf49 > .css-1cwyjr8")).click();
    driver.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .r-19m6qjp")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("TSGHHGFFKJGFJKG");
    driver.findElement(By.cssSelector(".r-d9fdf6:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    driver.findElement(By.cssSelector(".r-hrhsj0")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".r-hrhsj0"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".r-hrhsj0")).sendKeys("TIRUR");
    driver.findElement(By.cssSelector(".r-1biggbk > .r-13awgt0")).click();
    driver.findElement(By.cssSelector(".r-1xxv1ni")).click();
    driver.close();
  }
}
