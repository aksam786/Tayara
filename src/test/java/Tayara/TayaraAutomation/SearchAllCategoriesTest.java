package Tayara.TayaraAutomation;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class SearchAllCategoriesTest extends TestRunner{
@Test	
		public void SearchAllCategoriesBarTest(Method method) {
		
			SearchAllCategoriesPage SearchAllCategoriesTestObj = new SearchAllCategoriesPage(driver);
			SearchAllCategoriesTestObj.EnterTextInSearchAllCategories();
			SearchAllCategoriesTestObj.clickSearchButton();
			
		}

	}

