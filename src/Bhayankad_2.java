import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Bhayankad_2 {
	
	
	static LocalDateTime ldt=LocalDateTime.now();
	
	static int day=ldt.getDayOfMonth();
	
	static Month month=ldt.getMonth();
	
	static int value_xpath;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Drivers_Latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://flights.msn.com/en-in/flight-search");
		
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='place-selector js-place-selector']")).click();
		
		Robot r=new Robot();
		
		//Actions a=new Actions(driver);
		
		
		
		r.keyPress(KeyEvent.VK_D);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_E);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_L);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_H);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_I);
		
		Thread.sleep(12000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		
		r.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
r.keyPress(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_H);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_E);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(1000);
		
r.keyPress(KeyEvent.VK_I);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		driver.findElement(By.xpath("//div[@class='month']")).click();
		
		Thread.sleep(4000);
		
		
		
	
		
		System.out.println(day);
		
		System.out.println(month);
		
		//month=month.plus(1);
		
		day_calcualtor(day,31);
		
		System.out.println("Value_Xpath"+ value_xpath);
		
		System.out.println("Next Month" + month);
		
		WebElement calender_month=driver.findElement(By.xpath("(//span[@class='dropdown-accent js-dropdown-toggle-name'])[1]"));
		
		while(!driver.findElement(By.xpath("(//span[@class='dropdown-accent js-dropdown-toggle-name'])[1]")).getText().trim().equalsIgnoreCase(month+" 2020")) {
			
			
			driver.findElement(By.xpath("(//div[@class='ss-icon-arrow-right ss-icon'])[1]")).click();
			
			//Thread.sleep(1000);
			
			
		}
		
		
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		for(int i=1;i<=30;i++) {
			
			String xpath_date="(//div[contains(text(),'$v')])[$i1]";
			
			xpath_date=xpath_date.replace("$v", String.valueOf(value_xpath));
			
			xpath_date=xpath_date.replace("$i1", String.valueOf(i));
			
			System.out.println("xpath_date"+ xpath_date);
			
//			String xpath="(//div[contains(text(),'8')][$v]";
//			
//			xpath=xpath.replace("$v", String.valueOf(i));
			
			//System.out.println("Xpath in else"+xpath);
			
			
		
		if(driver.findElement(By.xpath(xpath_date)).getText().toString().trim().equalsIgnoreCase(String.valueOf(value_xpath))) {
		
		driver.findElement(By.xpath(xpath_date)).click();
		
		
		
		System.out.println("Inside if");
		
		break;
		
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	public static int day_calcualtor(int day, int month_max_day) {
		
		value_xpath=day+10;
		
		if(value_xpath>month_max_day) {
			
			value_xpath=value_xpath-month_max_day;
			
			month=month.plus(6);
			
			
			
		}
		return value_xpath;
		
		
	}

}
