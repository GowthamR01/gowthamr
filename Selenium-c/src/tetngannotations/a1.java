package tetngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	ChromeDriver d;
  
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://facebook.com");	
	}
	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
		d.manage().window().maximize();
	}
	
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		d.findElementById("email").sendKeys("gowtham.r@gmail.com");
	}
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		d.findElementById("pass").sendKeys("Gow@1234");
		d.findElementByName("login").click();
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After Class");
		d.navigate().refresh();
		
	}
	
	@AfterTest
	public void at() {
		System.out.println("After Test");
		d.quit();
	}
	
}
