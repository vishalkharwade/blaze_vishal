package moduletest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Module.navigate;
import Module.ticket;
import Module.welcomeHomepage;
import librarys.BaseClass;

public class BlazeDemoTestClass extends BaseClass  {
	navigate p3;
	welcomeHomepage p1;
	ticket p2;
	
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		initiaization();
		p1=new welcomeHomepage(driver);
		p2=new ticket(driver);
		p3=new navigate(driver);
	}
	@BeforeMethod
	public void selectcity() throws InterruptedException, IOException
	{
		p3.navigatebeachpage();
	//	p1.navig();
		Thread.sleep(200);
		p1.gettext();
		
	    Thread.sleep(200); 
		p1.selectcity1();
		p1.clickcity();
		Thread.sleep(500);
	}
	@Test
	public void purchesticket() throws InterruptedException {
		p2.clickonflight();
		
	}
}
