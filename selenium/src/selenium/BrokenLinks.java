package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	  
		public static void main(String args[]) { 
			int x = 111, y = 101;
			System.out.println((x&y));
	        switch (x & y) {
	            case 1 :
	                System.out.println("-1-");
	            case 101 :
	                System.out.println("-101-");
	            case 111 :
	                System.out.println("-111-");
	            case 010 :
	                System.out.println("-010-");
	            default :
	              System.out.println( y );
	            	 //System.out.println("-" + x & y + "-");
	        }
		
		
	}

}
