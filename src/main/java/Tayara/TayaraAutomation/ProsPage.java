package Tayara.TayaraAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProsPage {
	
	WebDriver driver;
	
    @FindBy(id="cta-shops")
    WebElement ProsButton;

    
    public ProsPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
   

	public void clickProsButton() {
    	ProsButton.click();
    }

}
