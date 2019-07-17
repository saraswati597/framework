package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PomTest {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/git/framework/selenium/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://demo.automationtesting.in/Windows.html");
	String parentWin=driver.getWindowHandle();
System.out.println(parentWin);
	driver.findElement(By.xpath("//a[@href='http://www.sakinalium.in']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	
	Set<String> AllWin = driver.getWindowHandles();
	for(String Child:AllWin)
	{
		if(!Child.equalsIgnoreCase(parentWin))
		{
			driver.switchTo().window(Child);
			System.out.println(driver.getTitle());
		}
	}
	for(String Child:AllWin)
	{
		if(Child.equalsIgnoreCase(parentWin))
		{
			driver.switchTo().window(Child);
			System.out.println(driver.getTitle());
		}
	}
}

}
