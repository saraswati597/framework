package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/eclipse-workspace/selenium/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.editablegrid.net/en/");
Actions act= new Actions(driver);

WebElement ele = driver.findElement(By.xpath("//td[@class='editablegrid-name' and text()='Hoffman']"));
WebDriverWait w= new WebDriverWait(driver,40);
w.until(ExpectedConditions.elementToBeClickable(ele));

act.doubleClick(ele).perform();
act.sendKeys("abc").perform();;
	List<WebElement> row = driver.findElements(By.xpath("//table[@id='tableid']//tr"));
	int rowSize=row.size();

	List<WebElement> column = driver.findElements(By.xpath("//table[@id='tableid']//tr//td"));
	int colSize=column.size();

	for(int i=1;i<rowSize;i++)
	{
	for(int j=1; j<=5;j++)	
	{
		String s= driver.findElement(By.xpath("//table[@id='tableid']//tr["+i+"]//td["+j+"]")).getText();
		System.out.println(s);
	}
	}
	

}
}
