import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class KHK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				
				
//				 FirefoxProfile firefoxprofile1=new FirefoxProfile();
//					
//					firefoxprofile1.setPreference("security.mixed_content.block_active_content", false);
//					
//					firefoxprofile1.setPreference("security.mixed_content.block_display_content", true);
//					 
//					wd = new Firefoxwd((Capabilities) firefoxprofile1);
//					
					//=========================working=============================//
	
			
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\SamirKhan\\Drivers_Latest\\geckodriver.exe");
				FirefoxOptions firefoxprofile=new FirefoxOptions();
				
				firefoxprofile.addPreference("security.mixed_content.block_active_content", false);
				
				firefoxprofile.addPreference("security.mixed_content.block_display_content", true);
				 
				WebDriver wd = new FirefoxDriver(firefoxprofile);
				 
				 //==================================================================//

				wd.manage().window().maximize();
				
				wd.get("https://rtb2.assurancewireless.com:8002/login/login.do");
				
				wd.findElement(By.xpath("//input[@id='min']")).sendKeys("6232132419");
				
				wd.findElement(By.xpath("//input[@name='vkey']")).sendKeys("123789");
				
				wd.findElement(By.xpath("//button[@id='submit']")).click();
				
				Thread.sleep(5000);
				
				wd.findElement(By.xpath("//a[@id='tab3']")).click();
				
				Thread.sleep(5000);
				
				wd.findElement(By.xpath("//a[contains(text(), 'Manage My Electronic')]")).click();
				
				Thread.sleep(5000);
				
				wd.switchTo().frame(wd.findElement(By.xpath("//iframe[@src='/myaccount/eSignConsent.do']")));
	              
	              Thread.sleep(6000);
	              
	              wd.findElement(By.xpath("//input[@id='esignActivate']")).click();
	              
	              //
	              
	              Thread.sleep(4000);
	              
	              wd.findElement(By.xpath("//input[@id='readTnC']")).click();
	              
	              Thread.sleep(2000);
	              
	              wd.findElement(By.xpath("//input[@id='btneSign']")).click();
	              
	              wd.switchTo().defaultContent(); 
				
				
			}
			
			
			catch(Exception ex) {
				
				ex.printStackTrace();
			}
				


	}

}
