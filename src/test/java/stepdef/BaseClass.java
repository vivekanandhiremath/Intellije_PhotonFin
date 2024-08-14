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
        PropertyReader reader = new PropertyReader("user.properties");
        String browser = reader.getProperty("browsertype");
        String base_url = reader.getProperty("url");

        System.out.println(browser);
        System.out.println(base_url);

        driver = WebdriverManager.getInstance(browser).getDriver();
        driver.manage().window().maximize();
        driver.get(base_url);


    }


    @After
    public void tearDown() {
//		WebdriverManager.quitBrowser();
    }
}
