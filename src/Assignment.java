import org.openqa.selenium.By;
		
		import org.openqa.selenium.WebDriver;
		
		import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		

		
				// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//				Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
				driver.findElement(By.xpath("//input[@value='option1']")).click();
				Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
				driver.findElement(By.xpath("//input[@value='radio1']")).click();

	}

}
