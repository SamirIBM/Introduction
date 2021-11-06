import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		//Grab the common attribute//Put it into List//Iterate
		int count = dates.size();
		//while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
			while(!driver.findElement(By.cssSelector("[class='datepicker-switch']")).getText().contains("Oct"))
		{
			//driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
				driver.findElement(By.cssSelector("th[class='next']")).click();
		}
			
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
