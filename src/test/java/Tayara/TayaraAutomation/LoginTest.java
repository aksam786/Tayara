package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoginTest extends TestRunner{
@Test
	public void LoginPageTest(Method method){
		LoginPage LoginPageObj = new LoginPage(driver);
		LoginPageObj.clickToLoginButton();
	}

}
