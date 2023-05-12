package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
     public static void main(String[] args) {
    	 
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
         ChromeDriver l = new ChromeDriver();
         
//         8 locators :
//         1. ID
//         2.Name 
//         3.Class name
//         4.Link text
//         5.Partial linktext
//         6.Tag name 
//         7.xpath
//         8.css
         l.get("http://www.mycontactform.com");
         l.findElementById("user").sendKeys("Dhivyakarthi123");
         
         l.findElementByName("pass").sendKeys("12345");
         
         l.findElementByClassName("btn_log").click();
         
         
         
	}
}
