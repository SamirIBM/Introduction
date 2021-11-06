import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem1 {
	
	//Enter the key BENG
	//verify if Airport option is displayed in the suggestive box

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SamirKhan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web//");
		WebElement source1= driver.findElement(By.id("fromPlaceName"));
		source1.sendKeys("BEN");
		/*source1.sendKeys(Keys.ARROW_DOWN);
		source1.sendKeys(Keys.ARROW_DOWN);
		source1.sendKeys(Keys.ARROW_DOWN);*/
		
		//But in the output, this step doesn't print the text. This is because of the fact that selnium cannot identify hidden elements.
		//This is nothing but Ajax implementation
		//investigate the properties of elements if it have any hidden text
		//Therefore, comes the concept of java script executor as Javascript DOM can identify hidden elements.
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById('fromPlaceName').value";// keyword in javascript takes the value and returns to
		//to the variable
		String text =(String)js.executeScript(script);
		int i=0;
		while(!text.contains("AIPRT"))
		{
			i++;
			source1.sendKeys(Keys.ARROW_DOWN);
			
			text =(String)js.executeScript(script);
			if(i>10)
			{
				break;
			}
				
			
		}
			
		System.out.println(text);
		
	}
}
