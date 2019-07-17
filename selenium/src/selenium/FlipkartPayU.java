package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class FlipkartPayU {
	public WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/git/framework/selenium/drivers/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "/Users/saraswati.soni/eclipse-workspace/TestPractice/exeFiles/geckodriver");
				driver=new FirefoxDriver();
				 
		  }
		
	}
	@Test
	@Parameters("searchterm")
	public void addToCart(String searchterm)
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBox.sendKeys(searchterm);
		searchBox.sendKeys(Keys.ENTER);
	String ProductName=	driver.findElement(By.xpath("//div[@data-id='MOBEXRGVCMGVCGGQ']//div[@class='_1UoZlX']")).getText();
		driver.findElement(By.xpath("//div[@data-id='MOBEXRGVCMGVCGGQ']//div[@class='_1UoZlX']")).click();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		String exp="Iphone";
		Assert.assertEquals(ProductName, exp," Product name mismatch");
		
		
	}
	@AfterMethod()
	public void GenerateReport(ITestResult result)
	{
		if(result.isSuccess())
		{
			Reporter.log("Test Passed", true);
		}
		else
		{
			String fileName = result.getMethod().getMethodName();
			
			Reporter.log("following method failed "+fileName, true);
		}
		
	}
	@AfterClass()
	public void closeBrowser()
	{
		  driver.close();
	}

}



