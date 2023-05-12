package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver l = new ChromeDriver();
    l.get("https:\\www.google.com");
    l.manage().window().maximize();
    l.executeScript("window.open('https://www.seleniumeasy.com/','_blank')");
    
    String p = l.getWindowHandle();
    Set<String> s1 = l.getWindowHandles();
    
    Iterator<String> I1 = s1.iterator();
    
    while(I1.hasNext()) {
    	String cw = I1.next();
    	if(!p.equals(cw)) {
    		l.switchTo().window(cw);
    		System.out.println(l.getTitle());
    		Thread.sleep(4000);
    		l.findElementByLinkText("Maven").click();
    		Thread.sleep(4000);
    		l.close();
    	}    
    }
    l.switchTo().window(p);
    System.out.println(l.getTitle());
    Thread.sleep(5000);
    l.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    l.quit();
}
}
