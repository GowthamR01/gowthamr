package Seleniumbuttons;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class db {
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
 		//step3:creating object for chromedriver class
 		ChromeDriver d= new ChromeDriver();
 		d.get("https://www.letskodeit.com/practice");
 	        // create an object fr select class
 			//pass list box as input
 			// index, value , visible
 			//multiple option can be selected, deselection is possible
 			
 			WebElement el = d.findElementById("multiple-select-example");
 			Select s = new Select(el);
 			s.selectByIndex(1);
 			s.selectByValue("apple");
 			s.selectByVisibleText("Peach");
 			Thread.sleep(3000);
 			
 			s.deselectByIndex(0);
 			Thread.sleep(3000);
 			d.quit();
 			
	}
}
