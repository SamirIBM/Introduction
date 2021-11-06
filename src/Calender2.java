import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		
		while(!driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText().contains("August 2019")) {
			
			driver.findElement(By.xpath("//th[@class='prev']")).click();
			
		}
		
		driver.findElement(By.xpath("//td[@class='day' and contains(text(),'18')]")).click();
	}

}
