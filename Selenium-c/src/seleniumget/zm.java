package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class zm {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	    ChromeDriver d = new ChromeDriver();
  	    
  	    d.get("http://www.google.com");
  	    
  	    d.executeScript("document.body.style.zoom='200%'");
  	    Thread.sleep(5000);

  	    d.executeScript("document.body.style.zoom='100%'");
  	    Thread.sleep(5000);

  	    d.executeScript("document.body.style.zoom='50%'");
  	    Thread.sleep(5000);
        d.quit();
	}
}
