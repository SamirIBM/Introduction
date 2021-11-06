import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.xpath("//a[contains(@title, 'Sign in')]")).click();
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("login");
		driver.findElement(By.xpath("//input[contains(@name, 'passw')]")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@name,'proce')]")).click();
		driver.close();

	}

}
