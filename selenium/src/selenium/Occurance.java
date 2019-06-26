package selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Occurance {
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
	    HashMap<String, Integer>hm=new LinkedHashMap<String, Integer>();
	    
	   for(WebElement a: elements)
	   {
	      String f = a.getText();
	    if(hm.containsKey(f))
	    {
	    	hm.put(f, hm.get(f)+1);
	    }
	    else
	    {
	    	hm.put(f, 1);
	    }
	   }
	  Set<Entry<String,Integer>> s= hm.entrySet();
	// Iterator<Entry<String, Integer>> i = s.iterator();
	  for(Entry<String, Integer> s1:s)
	  {
		 int value =s1.getValue(); 
		
			System.out.println(s1.getKey() +"  "+s1.getValue());
		
	  }
	 
	}

}
