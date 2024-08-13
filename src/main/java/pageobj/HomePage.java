package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	private WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//button[@type='button'][contains(.,'Get Started')]")
	private WebElement getstartedbtn;
	@FindBy(xpath = "//h2[contains(.,'To begin, please answer some questions for me')]")
	private WebElement text;

	@FindBy(xpath = "//button[.=' Get Started ']")
	private WebElement getstartedbtn2;

	public void clickOngetStarted() {
		getstartedbtn.click();
	}


	public void checktext() {
		String actual_text = text.getText();
		String expected_text = " To begin, please answer some questions for me ";
		Assert.assertEquals(actual_text, expected_text);
		System.out.println(actual_text);
	}

	public void clickOngetStarted2() {
		getstartedbtn2.click();
	}


}
