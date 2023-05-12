package seleniumget;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
     public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	 ChromeDriver g = new ChromeDriver();
    	 g.get("http://www.google.com");
    	 Thread.sleep(5000);
    	 
    	 System.out.println(g.getTitle());
    	 System.out.println(g.getCurrentUrl());
    	 Dimension d = g.manage().window().getSize();
    	 System.out.println("Height is " +d.getHeight());
    	 System.out.println("Width is "+ d.getWidth());
    	
    	 Point c = g.manage().window().getPosition();
    	 System.out.println("X value is "+ c.getX());
         System.out.println("Y value is "+ c.getY()); 
          
         g.getCapabilities();
          
    	 g.quit();
     }
}
