package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class LoadMoreButtonTest extends TestRunner{
@Test
	public void LoadMoreButtonPageTest(Method method){
		LoadMorePage LoadMorePageObj = new LoadMorePage(driver);
		LoadMorePageObj.clickLoadMoreButton();
			}

}
