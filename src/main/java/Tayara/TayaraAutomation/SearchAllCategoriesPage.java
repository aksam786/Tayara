package Tayara.TayaraAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchAllCategoriesPage {
	
		WebDriver driver;
		
	    @FindBy(xpath="/descendant::input[@type='text'][1]")
	    WebElement SearchAllCategoriesBar;
	    
	    @FindBy(xpath="/descendant::button[@type='submit'][1]")
	    WebElement SearchButton;
	    
	    public SearchAllCategoriesPage(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	    

	    public void EnterTextInSearchAllCategories(){
	    		SearchAllCategoriesBar.click();
	            SearchAllCategoriesBar.sendKeys("Apartment");
	    }  
	    
	    public void clickSearchButton() {
	    	SearchButton.click();
	    }

	    
	}

