package Seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
      public static void main(String[] args) throws InterruptedException {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	  
    	  ChromeDriver d = new ChromeDriver();
    	  d.get("http://facebook.com");
    	  d.manage().window().maximize();
//    	  d.manage().window().fullscreen();
    	  d.navigate().refresh();
    	  Thread.sleep(5000);
    	  d.quit();
    	  }
}
