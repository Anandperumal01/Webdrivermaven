import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	//public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		
		//driver =new ChromeDriver();
		System.out.println(" inital step up done");
		
	}
	
	@Test
	public void launchguru99page() {
		System.out.println(" open the guru 99 page");
		
	}
	
	@AfterTest
	public void teardown() {
		
		System.out.println(" Quit");
		
		System.out.println(" closed the driver");
	}

}
