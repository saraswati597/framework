package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/eclipse-workspace/selenium/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
		System.out.println("popup closed");
		driver.findElement(By.xpath("//div[@class='product product1']//img[@class='front icon']")).click();
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='applynowknowmore'][contains(text(),'Know More')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement	knowMore=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product product1 active']//div[@class='detailBox frontDetailBox']//a[@class='applynowknowmore'][contains(text(),'Know More')]")));
	knowMore.click();
}
}