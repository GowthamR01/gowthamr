package TestNG;

import org.testng.annotations.Test;

public class a1
{
@Test(priority=0,description="First",groups="G")
	public void t1() {
	System.out.println("Test Case 1");
}

@Test(priority=1,description="Second",groups="G",invocationCount=3)
public void ab() {
	System.out.println("Test Case 2");
}

@Test(priority=3,description="Third",groups="R",enabled=false)

public void t2() {
	System.out.println("Test Case 3");
}

}
