package pomclass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bollywood {

	@FindBy (xpath = "//a[text()='Bollywood 2022']")
	private WebElement bollywood ;
	
	@FindBy (xpath = "//a[text()='Designer - Guru Randhawa Mp3 Song']")
	private WebElement song  ;
	
	public Bollywood (WebDriver driver) {
	      PageFactory.initElements(driver, this);
	}
    
	public void Bollywood() {
      bollywood.click();
	}

  public void Song() {

	   song.click();
  }
  
}
