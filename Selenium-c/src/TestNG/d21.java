package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d21 {
    ChromeDriver d; 
	@Test(priority=0,description="Visit the website",groups="T")
	public void visit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://google.com");
	}
	
	@Test(priority=1,description="Maximize",groups="T")
	public void max() {
		d.manage().window().maximize();
	}
	
	@Test(priority=2,description="Refresh",invocationCount=3, groups="T")
	public void refresh() {
		d.navigate().refresh();
	}
	
	@Test(priority=3,description="Click",dependsOnGroups="T")
	public void click() {
		d.findElementByLinkText("Images");
	}
	
	@Test(priority=4,description="Close", timeOut=3000 ,dependsOnGroups="T")
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		d.quit();
	}
	
}
