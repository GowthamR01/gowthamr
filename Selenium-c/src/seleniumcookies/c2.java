package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
         ChromeDriver d = new ChromeDriver();

         d.get("http://www.facebook.com");
         Thread.sleep(2000);
         
         Set<Cookie> s = d.manage().getCookies();
         System.out.println("Number of cookies befor delete :"  +s.size());
         
         d.manage().deleteAllCookies();
         System.out.println("Number of cookies after delete :"  +s.size());
	}
} 
