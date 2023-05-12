package seleniumget;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rp {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	    ChromeDriver d = new ChromeDriver();
  	    
  	    d.get("http://www.google.com");
  	   
  	    Point pt = new Point(400,500);
  	    d.manage().window().setPosition(pt);
  	    Thread.sleep(5000);
  	    d.quit();
}
}
