package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ddb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://jqueryui.com/slider/");
	
	d.switchTo().frame(0);
	Actions ac = new Actions(d);
	
	WebElement ele = d.findElementById("slider");
	ac.dragAndDropBy(ele, 21, 0).build().perform();
	Thread.sleep(3000);
	d.quit();
	
}
}
