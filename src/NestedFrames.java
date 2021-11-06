import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SamirKhan\\\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		Thread.sleep(3000);
		//we can switch to a frame by "id", "name" or webelement
		
		//Method 1:
//		driver.switchTo().frame("frame-top");
//		driver.switchTo().frame("frame-middle");
		
		//Method 2:
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='content' and contains(text(),'MIDDLE')]")).getText());
		

	}

}		