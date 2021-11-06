import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		
		for(int i = 1;i<=3; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();
		Select  s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));//For static dropdown only
		s.selectByVisibleText("AED");
		Assert.assertEquals((driver.findElements(By.xpath("//input[@type='checkbox']")).size()), 6);
		Assert.assertFalse((driver.findElement(By.cssSelector("input[type='checkbox']"))).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Assert.assertTrue((driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"))).isSelected());
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//this is written in the format
		//.className where the spaces have been replaced by .
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertEquals((driver.findElement(By.id("Div1")).getAttribute("style")), "display: block; opacity: 1;");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertEquals((driver.findElement(By.id("Div1")).getAttribute("style")), "display: block; opacity: 0.5;");

	}

}
