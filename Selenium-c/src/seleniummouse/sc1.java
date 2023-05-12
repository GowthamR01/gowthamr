package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sc1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.mycontactform.com");
	WebElement el = d.findElementByName("btnSubmit");
	Actions ac = new Actions(d);
//	ac.click(el).build().perform();
//	ac.doubleClick(el).build().perform();
//	ac.contextClick(el).build().perform();
//	ac.clickAndHold(el).build().perform();
//	Thread.sleep(3000);
//	ac.release(el).build().perform();
//	Thread.sleep(3000);
	ac.moveToElement(el).click().build().perform();
	Thread.sleep(3000);
	d.quit();
	
}
}
