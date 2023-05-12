package seleniummouse;

import org.openqa.selenium.chrome.ChromeDriver;

public class dp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgowt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver d= new ChromeDriver();
	d.get("https://jqueryui.com/datepicker//");
	
	d.switchTo().frame(0);
	d.findElementById("datepicker").click();
	for(int i =0; i<4; i++) {
		d.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
	}
	d.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a").click();
	Thread.sleep(5000);
	d.quit();
}
}
