package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dd {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://jqueryui.com/droppable/");
	
	d.switchTo().frame(0);
	Actions ac = new Actions(d);
	WebElement el1 = d.findElementById("draggable");
	WebElement el2 = d.findElementById("droppable");
	ac.dragAndDrop(el1,el2).build().perform();
	Thread.sleep(3000);
	d.quit();
	
}
}
