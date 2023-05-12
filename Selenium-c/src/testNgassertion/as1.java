package testNgassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class as1 {
	
	

	@Test
	public void hrd() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("https://google.com");
	//Assert.assertEquals(d.getTitle(), ".,jlkn");
//	Assert.assertNotEquals(d.getTitle(), ".,jlkn");
	WebElement ele = d.findElementByLinkText("Gmail");
	Assert.assertTrue(ele.isDisplayed());
//	Assert.assertFalse(ele.isSelected());
	d.quit();
	}
}
