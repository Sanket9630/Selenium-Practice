package testing23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass2.Bollywood;
import pomclass2.Searchbar;

public class Testclass4444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\chrome may 2022\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	driver.get("https://www.pagalworld.pw/");

  Searchbar searchbar = new Searchbar(driver);
    
  searchbar.Searchbar();
  searchbar.Searchbutton();
  

	
		
		
		
		
	}

}
