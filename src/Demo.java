
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Created Driver Object for  Chrome Browser
		
		//we will strictly implement methods of Webdriver
		
		//invoke .exe file
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com"); // Hit url on the browser.
		System.out.println(driver.getTitle());  // To validate if your page title is correct..
		
		System.out.println(driver.getCurrentUrl());  // To validate if you lnded on correct url
		
		//System.out.println(driver.getPageSource());  // Print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.close();//It closes current browser.
		//driver.quit();//It closes all the browsers opened by Selenium Script
		
		
		
		
		
	}

}
