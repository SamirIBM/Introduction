        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyXpath {
	
	
	public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://facebook.com");
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Login");//customized Xpath
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");//customized Xpath
	
	driver.findElement(By.xpath("//input[@value='Log In']")).click();//customized Xpath
	
	driver.close();

}
	
}
