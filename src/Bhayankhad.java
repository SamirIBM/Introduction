import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bhayankhad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		WebElement webelement=driver.findElement(By.xpath("xpath"));
		
		Select select=new Select(webelement);
		
		select.
		
		driver.switchTo().alert().accept();
		
		Actions a=new Actions(driver);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().deleteCookieNamed("");
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//select.s
		
		//driver.switchTo().w
//		
//		Actions a=new Actions(driver);
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(20, SECONDS).pollingEvery(2,SECONDS)
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().to("");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
//		a.sendKeys(Keys.ENTER);
//		
//		Alert alert=driver.switchTo().alert();
//		
//		alert.accept();
//		
//		alert.dismiss();
//		
//		alert.sendKeys("");
//		
//		alert.getText();
		
		
		
		
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("")));
//		
//		Wait wait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2.TimeUnit.SECONDS).ignoring()
//		
//		driver.findElements(By.xpath("")).size();
//		
//		
//		driver.get("http://msn.com");
//		
		Thread.sleep(8000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		try {
		
		Thread.sleep(5000);
		
		
		
//		a.click(driver.findElement(By.xpath("(//iframe)[6]")));
//		
//		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		r.mouseWheel(60);
		
		Thread.sleep(10000);
		
		//a.click(driver.findElement(By.xpath("//li[@id='fbcount']/iframe")));
		
		//driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[6]")));
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//li[@id='fbcount']/iframe")).click();
		
		System.out.println("Switched to Frame");
		
		//a.click(driver.findElement(By.xpath("//li[@id='fbcount']/iframe"))).build().perform();
		
		
		
		try {
			
			Thread.sleep(3000);
			
			Actions a=new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.xpath("//ul[@id='social-plugins']/li"))).click().build().perform();
			
			//a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Privacy & Cookies')]")), -150, 0).build().perform();
			
			//a.moveByOffset(100, 500).build().perform();
			
			//a.m
			
			//a.click(driver.findElement(By.xpath("//ul[@id='social-plugins']/li"))).build().perform();
			try {
			a.click(driver.findElement(By.xpath("//div[@id='foot']/footer/ul[2]/li/iframe"))).build().perform();
			
			System.out.println("clicked the element");
			
			}
			
			catch(Exception ex) {
				
				ex.printStackTrace();
				
				System.out.println("Couldn't click the element");
			}
			
			a.click(driver.findElement(By.xpath("//ul[@id='social-plugins']/li"))).build().perform();
			
			
			System.out.println("clicked the element");
			
			//a.sendKeys(driver.findElement(By.xpath("//div[@id='foot']/footer/ul[2]/li/iframe")),r.mousePress(InputEvent.BUTTON1_DOWN_MASK));
			
			//a.
//			
//			a.
		
		
		
//		Thread.sleep(1000);
//		
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//
//		Thread.sleep(1000);
//
//		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	
		
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
			
			System.out.println("Couldn't click");
		}
		
		
		
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}

	}

}
