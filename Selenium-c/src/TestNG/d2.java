package TestNG;

import org.testng.annotations.Test;

public class d2 {

	@Test(priority=0,groups="D")
	public void user() {
		System.out.println("user");
	}
	
	@Test(priority=1,groups="D")
	public void pass() {
		System.out.println("Password");
	}
	
	@Test(priority=2,dependsOnGroups="D")
	public void lg() {
		System.out.println("Login");
	}
}
