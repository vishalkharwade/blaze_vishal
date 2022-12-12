package librarys;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public void initiaization() throws IOException {
		
		driver=new ChromeDriver();
		driver.get(utilityclass.getpropertFileData("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
