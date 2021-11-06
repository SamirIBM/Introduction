import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Drivers_Latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,2000)");
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}

	}

}
