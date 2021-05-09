package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class ProsButtonTest extends TestRunner {
@Test
	public void ProsTest(Method method){
		ProsPage ProsPageObj = new ProsPage(driver);
		ProsPageObj.clickProsButton();
	}

}
