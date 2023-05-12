package tesngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class fw {

	@Test
	public void fw1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
	    d.get("http://www.google.com");
	//Declare and initialise a fluent wait
	    FluentWait w = new FluentWait(driver);
	
	//Specify the timout of the wait
	    w.withTimeout(6000, TimeUnit.MILLISECONDS);
	
	//Sepcify polling time
	    w.pollingEvery(2000, TimeUnit.MILLISECONDS);
	
	
	    w.until(ExpectedConditions.alertIsPresent());
	}
}
