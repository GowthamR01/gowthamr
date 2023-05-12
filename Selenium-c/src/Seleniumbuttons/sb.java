package Seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class sb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//step3:creating object for chromedriver class
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.letskodeit.com/practice");
		d.findElementById("bmwradio").click();
		Thread.sleep(2000);
		d.findElementById("benzradio").click();
		Thread.sleep(2000);
		d.findElementById("hondaradio").click();
		Thread.sleep(2000);
		d.quit();
	}
	
}
