package tesngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ew {

	@Test
	public void t1()
	{ 
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
            ChromeDriver d = new ChromeDriver();
		    d.get("http://www.google.com");
			WebDriverWait w= new WebDriverWait(d,5);
			
			//title
			//w.until(ExpectedConditions.titleIs("Go[sdmgle"));//5
			//w.until(ExpectedConditions.titleContains("oo")); //5
			
			//alert
			//w.until(ExpectedConditions.alertIsPresent());
			
			//visibility/invisbility
			// find and visibility
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy")));//5
			
			//visibility of all images
			//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));//5
			
			w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
			
			d.quit();
	}
}
