package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver l = new ChromeDriver();
		
		l.get("http://www.facebook.com");
		
		l.findElementById("email").sendKeys("abcd@gmail.com");
		l.findElementByName("pass").sendKeys("123456");
		
		
	}
} 
