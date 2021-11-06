import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		Thread.sleep(50);
		//driver.findElement(By.xpath("(//a[@value ='BOM'])[2]")).click();if someone doesn't like indexing
		
		driver.findElement(By.xpath("//div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
	}

}
