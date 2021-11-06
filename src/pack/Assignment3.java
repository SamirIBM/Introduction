package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php#");
		driver.findElement(By.id("checkBoxOption1")).click();
		String s= driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		Select s1 = new Select(driver.findElement(By.id("dropdown-class-example")));
		s1.selectByVisibleText(s);
		driver.findElement(By.id("name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		//Assert.assertTrue(driver.switchTo().alert().getText().contains(s));
		
		
		

	
	}
}
