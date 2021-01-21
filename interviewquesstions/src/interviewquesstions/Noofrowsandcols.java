package interviewquesstions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Noofrowsandcols {
	
	WebDriver driver;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		
		
	}

}
 