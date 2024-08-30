package testng;

import org.testng.annotations.Test;

public class grouping {
@Test(priority=1,groups= {"sanity","regression","functional"})

public void loginByEmail() {
	System.out.println("login successful");
}
@Test(priority=2,groups= {"sanity"})
public void loginByfacebook() {
	System.out.println("login successful by facebook");

}
@Test(priority=3,groups= {"sanity"})
public void loginBytwitter() {
	System.out.println("login successful by twitter");
}
@Test(priority=4,groups= {"regression"})
public void signupbyemail() {
	System.out.println("signup successful ");
	}

@Test(priority=5,groups= {"sanity","regression","functional"})
public void signupbyfacebook() {
	System.out.println("signup successful by facebook");
	
}
@Test(priority=6,groups= {"sanity"})
public void signupbytwitter() {
	System.out.println("signup successful by twitter");
}
@Test(priority=7,groups= {"regression"})
public void paymentbytwitter() {
	System.out.println("payment successful by twitter");
}


}