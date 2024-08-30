package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class assert1 {
	@BeforeTest
	public void tearup() {
		Assert.assertTrue(true);
	}
	public void hardassertions() {
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		Assert.assertTrue(false);
		System.out.println("testing");
		Assert.assertEquals(true, "this can be done");
	}
	@AfterTest
	public void softassertions() {
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("hard assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();

	}

}
