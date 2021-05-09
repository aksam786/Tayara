package Tayara.TayaraAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCatgoriesPage {
WebDriver driver;
	
   public AllCatgoriesPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public void clickAllCategoriesButton() throws InterruptedException{
    	int number = driver.findElements(By.xpath("//div[@class='category--filter__item-title']")).size();
    	System.out.println(number);
    	for(int i=1;i<number;i++) {
    		WebElement Category = driver.findElement(By.xpath("/descendant::div[@class='category--filter__item-title'][" + (i+1) + "]"));
    		Category.click();
    		Thread.sleep(2000);
    		driver.navigate().back();
    	}
    }
}
