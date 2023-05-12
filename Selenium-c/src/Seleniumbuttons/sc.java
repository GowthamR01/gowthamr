package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//step3:creating object for chromedriver class
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.seleniumeasy.com");
		
		        // vertical scroller      : move along y axis, x value will be 0
				//                         down: +y
				//                          up : -y
				
				// horizontal scroller  : move along x axis, y value will be 0
				//                      right: +x
				//                      left : -x
				
				
				// method1: pageup and down
				d.executeScript("window.scrollBy(0, document.body.scrollHeight)"); // down
				Thread.sleep(3000);
				d.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
				Thread.sleep(3000);
				
//		        d.executeScript("window.scrollBy(0, 300)"); // down
//				Thread.sleep(3000);
//				d.executeScript("window.scrollBy(0, -300)"); 
//				Thread.sleep(3000);
				d.quit();
			
		
}
}
