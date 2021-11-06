import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		WebElement source=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		source.clear();
		source.sendKeys("kol");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("pun");
		Thread.sleep(4000);
		destination.sendKeys(Keys.ENTER);
	}

}
