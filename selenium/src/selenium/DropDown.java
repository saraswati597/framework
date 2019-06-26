package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/eclipse-workspace/selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Settings')]")).click();
		
	driver.findElement(By.xpath("//a[contains(text(),'Advanced search')]")).click();
		
driver.findElement(By.xpath(" //div[@id='lr_button']")).click();
WebElement eng = driver.findElement(By.xpath("//div[@class='goog-menuitem-content' and text()='English']"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", eng);
//		
//	List<WebElement>l=	driver.findElements(By.xpath("//div[@class='goog-menuitem-content']"));
//	
//	for(WebElement val:l)
//	{
//		if (val.getText().equals("Arabic"))
//		{
//			val.click();
//			break;
//		}
//	}
//	try {
//		Thread.sleep(50);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	driver.findElement(By.xpath(" //div[@id='cr_button']")).click();
//	List<WebElement>l1=	driver.findElements(By.xpath("//div[@class='goog-menuitem-content']"));
//	for(WebElement val1:l1)
//	{
//		if (val1.getText().equals("Albania"))
//		{
//			val1.click();
//			break;
//		}
//	}
//	
//	try {
//		Thread.sleep(50);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
