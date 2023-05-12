package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();

        d.get("http://www.facebook.com");
        Thread.sleep(3000);
        
        Set<Cookie> s = d.manage().getCookies();
        System.out.println(s.size());
         
        
        for(Cookie x:s) {
        	System.out.println("name is : "+x.getName());
        	System.out.println("Value is :"+x.getValue());
        	System.out.println("Expiry date is :"+x.getExpiry());
        	System.out.println();
        	
        }
	}
	            
	    
}
