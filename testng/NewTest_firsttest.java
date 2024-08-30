package testng;

import org.testng.annotations.Test;

public class NewTest_firsttest {
  @Test(priority=1 )
  public void f() {
	 System.out.print("this is open url");
	  
  }
  @Test(priority=2)
  void Login() {
		System.out.println("this is login");
	}

	@Test(priority=3)
	void logout() {
		System.out.println("this is logout");
	}
	}

