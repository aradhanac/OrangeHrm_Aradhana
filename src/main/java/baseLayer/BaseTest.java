package baseLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilityLayer.Reader;


public class BaseTest {
	
	protected static WebDriver driver;

	public static void setUp() throws FileNotFoundException, IOException {
		
		 driver = new ChromeDriver();
		
		driver.get(Reader.getProperty("URI"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	
}
