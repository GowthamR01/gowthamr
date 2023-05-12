package TestNG;

import org.testng.annotations.Test;

public class a2 {

	@Test(timeOut=1000)
	public void t1() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Test Case Check");
		
	}
}
