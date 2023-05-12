package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
           public static void main(String[] args) throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
       		ChromeDriver l = new ChromeDriver();
       		l.get("https://www.google.com");
//       		l.findElementByLinkText("Forgotten password?").click();
//       		l.findElementByPartialLinkText("Forgotten").click();
//       		List<WebElement> i = l.findElementsByTagName("img");
//       		System.out.println("Number of images is : "+ i.size());
       		
       		List<WebElement> a1 = l.findElementsByTagName("a");
       		System.out.println("Number of links is : "+ a1.size());
       		
       		for (WebElement x:a1) {
       			System.out.println(x.getAttribute("href"));
       		}
       		
//       		List<WebElement> d = l.findElementsByTagName("div");
//       		System.out.println("Number of div's is : "+ d.size());
       		
       		l.close();
       		
       		
		}
}
