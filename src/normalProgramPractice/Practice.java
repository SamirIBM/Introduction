//import org.openqa.selenium.By;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		//Random rand=new Random();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Drivers_Latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("msn.com");
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//www.facebook.com/plugins/like.php?locale=en_US&href=https%3A%2F%2Fwww.facebook.com%2Fmsnindia&send=false&layout=button_count&width=450&show_faces=false&font&colorscheme=light&action=like&height=21']")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//iframe[@src='//www.facebook.com/plugins/like.php?locale=en_US&href=https%3A%2F%2Fwww.facebook.com%2Fmsnindia&send=false&layout=button_count&width=450&show_faces=false&font&colorscheme=light&action=like&height=21']")).click();
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}

	}

}
