import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activation_Link {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Drivers_Latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sales-prepaid-rtb2.test.sprint.com:8001/boost-sales-portal/faces/login.jsp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='loginform:USER']")).sendKeys("sremployee");
		
        driver.findElement(By.xpath("//input[@id='loginform:PASSWORD']")).sendKeys("Triumph1");
        
        driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
        
        //driver.findElement(By.xpath("//a[contains(text(),'Activate')]")).click();
        
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions a= new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Activate')]"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Boost Activation')]")).click();
		
	}

}
