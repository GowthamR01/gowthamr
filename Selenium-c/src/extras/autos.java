package extras;

import org.openqa.selenium.chrome.ChromeDriver;

public class autos {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver l = new ChromeDriver();
    l.get("https:\\www.google.com");
    
}
}
