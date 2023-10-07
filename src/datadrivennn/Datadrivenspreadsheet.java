package datadrivennn;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Datadrivenspreadsheet {
		
		WebDriver driver;
		@BeforeTest
		public void set()
		{
			//ChromeDriver options=new ChromeOptions();
			//options.addArgument("----remote-allow-origins=*");
			//driver=new ChromeDriver(options);
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void urlload()
		{
			driver.get("https://www.facebook.com/");
		}
	@Test
	public void main() throws IOException 
	{
	File f=new File("C:\\Users\\ASUS\\Desktop\\SOFTWARE TESTING\\ST WORKS\\Book1.xlsx");//read file
	FileInputStream fi=new FileInputStream(f); //read file
	XSSFWorkbook wb=new XSSFWorkbook(fi);//excelsheet
	XSSFSheet sh=wb.getSheet("Sheet1");//getting the sheet
	System.out.println(sh.getLastRowNum());//last row
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		
	String username =sh.getRow(i).getCell(0).getStringCellValue();//read cell values
			System.out.println("username:"+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);				
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);		
			driver.findElement(By.name("login")).click();		
			
			String actualurl=driver.getCurrentUrl();
			System.out.println(actualurl);
			
			String expurl="https://www.facebook.com/";
			
			if(expurl.equals(actualurl))
			{
				System.out.println("login Successfully");
			}
			else
			{
				System.out.println("Login failed");
			}
	}
	}
	}


