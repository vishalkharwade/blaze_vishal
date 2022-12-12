package Module;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import librarys.utilityclass;

public class welcomeHomepage {
	WebDriver driver;
	@FindBy(xpath = "//h1[text()='Welcome to the Simple Travel Agency!']") private WebElement text;
	@FindBy(xpath = "//a[text()='destination of the week! The Beach!']") private WebElement nav;//
	@FindBy(xpath = "//select[@class='form-inline'][1]") private WebElement primcity;
	@FindBy(xpath = "//select[@class='form-inline'][2]") private WebElement Dcity;
	@FindBy(xpath = "//input[@class='btn btn-primary']") private WebElement addcity;
	public welcomeHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void navig() throws InterruptedException, IOException {
		nav.click();
		Thread.sleep(500);
	driver.navigate().back();
	}
	public void gettext() {
		String t = text.getText();
		System.out.println(t);
		
	}
	
	public void selectcity1() throws InterruptedException {
		
		Select s1=new Select(primcity);
		s1.selectByVisibleText("Mexico City");
		Thread.sleep(500);
		Select s2=new Select(Dcity);
		s2.selectByVisibleText("London");
		Thread.sleep(500);
		
		
	}
public void clickcity() {
	addcity.click();
}
	
	
}


