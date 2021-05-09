package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class CreateAnAdTest extends TestRunner{
@Test
	public void CreateAnAdPageTest(Method method){
		CreateAnAdPage CreateAnAdPageObj = new CreateAnAdPage(driver);
		CreateAnAdPageObj.clickCreateAnAdButton();
	}
}
