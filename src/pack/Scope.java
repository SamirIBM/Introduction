package pack;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public  static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//counts of the links on the page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());//count of links on the entire page.
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));//Limitting web driver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());//count of links only at the footer.
		
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//tr//td[1]//ul[1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}	
			Set<String> windowHandler=driver.getWindowHandles();	
			Iterator<String> it =windowHandler.iterator();
				
			while(it.hasNext())
			{
				;
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

