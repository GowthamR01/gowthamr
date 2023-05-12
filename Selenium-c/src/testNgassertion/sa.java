package testNgassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sa {
	
	@Test
	public void sft() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://google.com");
		SoftAssert s = new SoftAssert();
        Assert.assertEquals(d.getTitle(), "Google");
		Assert.assertNotEquals(d.getTitle(), ".,jlkn");
		WebElement ele = d.findElementByLinkText("Gmail");
		s.assertTrue(ele.isDisplayed());
		s.assertFalse(ele.isSelected());
		d.quit();
		s.assertAll();
	}

}
