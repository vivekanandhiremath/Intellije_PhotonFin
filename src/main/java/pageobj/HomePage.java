package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//button[@type='button'][contains(.,'Get Started')]")
	private WebElement getstartedbtn;
	
	
	public void clickOngetStarted() {
		getstartedbtn.click();
	}
}
