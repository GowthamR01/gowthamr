package seleniumnavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver l = new ChromeDriver();
    
    l.get("http://www.google.com");
    Thread.sleep(3000);
    
    l.findElementByLinkText("Images").click();
    Thread.sleep(3000);
    
    l.navigate().back();
    Thread.sleep(3000);
    
    l.navigate().forward();
    Thread.sleep(3000);
 
    l.quit();
    
}
}
