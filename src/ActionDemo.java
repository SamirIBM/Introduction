import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.com");
				Actions a =new Actions(driver);
				a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();//for mouseover on the particular element
				//The above line moves to specific element.
				
				//The same code can be written as a.moveToElement(move).build().perform();
				
				WebElement move = driver.findElement(By.id("nav-link-accountList"));//WebElement variavle move is created.
				
				a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

				String x="{\r\n" + 
						"  \"portInInfo\": {\r\n" + 
						"    \"actionType\": \"RESUBMIT\",\r\n" + 
						"    \"portRequestId\": \"12345678\",\r\n" + 
						"    \"portInNumber\": \"2695996041\",\r\n" + 
						"    \"oldAccountPassword\": \"123456789\",\r\n" + 
						"    \"oldAccountId\": \"9834594356\",\r\n" + 
						"    \"oldAccountFirstName\": \"Test\",\r\n" + 
						"    \"oldAccountLastName\": \"Test\",\r\n" + 
						"    \"oldServiceProviderId\": \"6234\",\r\n" + 
						"    \"oldServiceProviderName\": \"Other SP WLESS\"\r\n" + 
						"  }\r\n" + 
						"} ";


	}

}
