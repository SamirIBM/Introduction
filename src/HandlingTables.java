import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Crome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20786/nz-vs-ind-4th-odi-india-tour-of-new-zealand-2019");
			WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr'"));
			int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
			//System.out.println(rowcount);
			int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			
			for(int i=0;i<count-2;i++)
			{
				//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				int valueInteger = Integer.parseInt(value);
				sum = sum +valueInteger;
				
			}
			
			
			
			
			String extras =driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
			int integerExtras = Integer.parseInt(extras);
			sum = sum + integerExtras;
			System.out.println(sum);
			
			System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
