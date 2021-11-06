package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.id("hp-widget__depart")).click();
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		//Grab the common attribute//Put it into List//Iterate
		int count = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
		//while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
			while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("OCT"))
		{
			//driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
				driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
			
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}

	}

}
