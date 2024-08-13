package stepdef;


import base.WebdriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobj.HomePage;
import utils.PropertyReader;

public class StepDef {
	private WebDriver driver;
	private HomePage hp;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		PropertyReader reader = new PropertyReader("user.properties");
		String browser = reader.getProperty("browsertype");

		driver = WebdriverManager.getInstance(browser).getDriver();
		hp = new HomePage(driver);
	}

	@When("user click on getstarted")
	public void user_click_on_getstarted() {
		hp.clickOngetStarted();
	}

	@Then("user should able to view the To begin, please answer some questions for me")
	public void user_should_able_to_view_the_to_begin_please_answer_some_questions_for_me() {
		hp.checktext();
	}

	@Then("user click on getstarted again")
	public void userClickOnGetstartedAgain() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		hp.clickOngetStarted2();
	}
}
