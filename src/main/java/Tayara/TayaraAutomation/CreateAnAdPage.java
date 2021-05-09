package Tayara.TayaraAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAdPage {
WebDriver driver;
	
    @FindBy(id="cta-publish")
    WebElement CreateAnAdButton;

    
    public CreateAnAdPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public void clickCreateAnAdButton() {
    	CreateAnAdButton.click();
    }

}
