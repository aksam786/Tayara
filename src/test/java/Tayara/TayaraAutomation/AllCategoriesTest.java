package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class AllCategoriesTest extends TestRunner{
@Test
	public void AllCategoriesPageTest(Method method) throws InterruptedException{
		AllCatgoriesPage AllCatgoriesPageObj = new AllCatgoriesPage(driver);
		Thread.sleep(2000);
		AllCatgoriesPageObj.clickAllCategoriesButton();
	}

}
