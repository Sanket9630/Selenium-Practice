package pomclass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbar {

	
	@FindBy (xpath = "//input[@title='search']")
      private WebElement searchbar;
	
	@FindBy (xpath = "//button[@class='gsc-search-button gsc-search-button-v2']")
      private WebElement searchbutton;
	
	public Searchbar(WebDriver driver) {
		
		PageFactory.initElements(driver,this );
	}
	
	public void Searchbar() {
	
		searchbar.sendKeys("sami sami");
		}
   public void Searchbutton() {
	   
	   searchbutton.click();
   }

}

