import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//Inplicit Wait
		driver.get("https://paytm.com/");
		driver.findElement(By.cssSelector("._1rUn.SaN4")).click();
		
		WebDriverWait d=new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_1s0u']//li[@data-index='0']")));//Explicit Wait
		driver.findElement(By.xpath("//div[@class='_1s0u']//li[@data-index='0']")).click();
	
	}

}
