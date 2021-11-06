
		// TODO Auto-generated method stub

		
		import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class IdentifyElements {
		
		
		public static void main(String[] args) {

		
				// TODO Auto-generated method stub
				
				//Created Driver Object for  Chrome Browser
				
				//we will strictly implement methods of Webdriver
				
				//invoke .exe file
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://facebook.com");
				driver.findElement(By.id("email")).sendKeys("Selenium Test");
				driver.findElement(By.name("pass")).sendKeys("123456");
				//driver.findElement(By.linkText("Forgotten account?")).click();
				
			    //driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
				
				driver.findElement(By.cssSelector( "#u_0_2")).click();
				
				//driver.findElement(By.cssSelector("input#u_0_2")).click();
				
				driver.findElement(By.cssSelector("#email")).getText();
	}

}
