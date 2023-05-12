package executescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver l = new ChromeDriver();
        l.get("http://www.letskodeit.com");
        
        System.out.println(l.executeScript("return document.title"));
        System.out.println(l.executeScript("return document.URL"));
        l.quit();
	}
	
}
