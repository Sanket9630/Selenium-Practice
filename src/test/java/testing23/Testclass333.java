package testing23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass2.Bollywood;

public class Testclass333 {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARE TESTING\\chrome may 2022\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get("https://www.pagalworld.pw/");
	
	Bollywood bollywood = new Bollywood(driver);
	
		bollywood.Bollywood();
		bollywood.Song();
		
	
	
	
	
	
	
	}

}
