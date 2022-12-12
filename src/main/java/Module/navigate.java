package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class navigate {
WebDriver driver;
	
		@FindBy(xpath = "//a[text()='destination of the week! The Beach!']") private WebElement nav;
		
		public navigate(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}
		
		public void navigatebeachpage() throws InterruptedException {
			nav.click();
			Thread.sleep(500);
			((WebElement) driver.navigate()).click();
			
		}
}

