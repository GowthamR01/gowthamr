package executescript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver l = new ChromeDriver();
    l.get("http://www.mycontactform.com");
    
//    System.out.println(l.executeScript("return document.title"));
//    System.out.println(l.executeScript("return document.URL"));
//    l.executeScript("alert('Timeout')");
    l.executeScript("window.confirm('Timeout')");
    Alert al = l.switchTo().alert();  
    Thread.sleep(3000);

    al.accept();
    Thread.sleep(3000);

    l.quit();
}
}
