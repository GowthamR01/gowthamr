package seleniumget;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class g2 {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	    ChromeDriver d = new ChromeDriver();
   	    
   	    d.get("http://www.google.com");
   	    Thread.sleep(5000);
   	    
   	    Dimension d2 = new Dimension(720,720);
   	    d.manage().window().setSize(d2);
   	    d.quit();
   	 
	}
}
