
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Created Driver Object for  Chrome Browser
		
		//we will strictly implement methods of Webdriver
		
		//invoke .exe file
		
		//For firefox, we need to download the gecko driver
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Gecko Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com"); // get n navigate difference
		System.out.println(driver.getTitle());
		
		
		
	}


	}

