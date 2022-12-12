package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ticket {
	@FindBy(xpath = "(//input[@class='btn btn-small'])[3]") private WebElement book;

	@FindBy(xpath = "//input[@class='btn btn-primary']")private WebElement buy;
	
	
	public ticket(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonflight() throws InterruptedException {
		book.click();
	Thread.sleep(500);
		buy.click();
	}
}
