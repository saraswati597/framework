package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveDuplicaesFromList {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "/Users/saraswati.soni/eclipse-workspace/selenium/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_lists.asp");
	System.out.println("browser launched");
    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='w3col w3-half']//li"));
    System.out.println("browser launched");
    System.out.println("Number of elements:" +elements.size());
System.out.println("List containing duplicate values");
    for(WebElement el:elements)
    {
    	System.out.println(el.getText());
    }
    int c=0;
   
    Set<String> S= new LinkedHashSet<String>();

   for(WebElement a: elements)
   {
      String f = a.getText();
     S.add(f);
   }
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println("Unique  values");
   System.out.println();
   System.out.println();
   System.out.println();
   Iterator<String> u = S.iterator();
   while(u.hasNext())
   {
	   System.out.println(u.next());
   }
}
}
