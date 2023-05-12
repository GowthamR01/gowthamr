package tesngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {

	@Test
	public void t1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
		d.get("http://www.google.com");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(d.getTitle());//5
		System.out.println(d.getCurrentUrl());//5
		d.navigate().refresh();//5
		d.findElementByLinkText("njhj"); //5
		d.quit();//5
	}
}
