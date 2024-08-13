package stepdef;


import base.WebdriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;

public class BaseClass {

	
	private WebDriver driver;

	@Before
	public void setUp() {
		PropertyReader reader=new PropertyReader("user.properties");
		String browser = reader.getProperty("browsertype");
		System.out.println(browser);

				driver = WebdriverManager.getInstance(browser).getDriver();
				driver.get("https://staging.photonfin.com/#/");

	}
	
	
	
	@After
	public void tearDown() {
		WebdriverManager.quitBrowser();
	}
}
