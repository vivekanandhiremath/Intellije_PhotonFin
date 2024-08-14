package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage {
    private WebDriver ldriver;
    @FindBy(xpath = "//button[@type='button'][contains(.,'Get Started')]")
    private WebElement getstartedbtn;
    @FindBy(xpath = "//h2[contains(.,'To begin, please answer some questions for me')]")
    private WebElement text;
    @FindBy(xpath = "//button[.=' Get Started ']")
    private WebElement getstartedbtn2;
    @FindBy(xpath = "//input[contains(@placeholder,'Enter Amount')]")
    private WebElement enteramounttextfield;
    @FindBy(xpath = "//input[contains(@placeholder,'Enter loan period')]")
    private WebElement loadnperiodtextfield;
    @FindBy(xpath = "//button[contains(.,'Next')]")
    private WebElement nextbutton;
    @FindBy(xpath = "//label[@for='checkbox42'][contains(.,'Mutual Funds')]")
    private WebElement mutualfunds;
    @FindBy(xpath = "//span[contains(.,'Shares')]")
    private WebElement shares;
    @FindBy(xpath = "//label[@for='checkbox43'][contains(.,'Both')]")
    private WebElement both;
    @FindBy(xpath = "//input[contains(@id,'min')]")
    private WebElement mininvestmenttextfield;
    @FindBy(xpath = "//input[contains(@id,'max')]")
    private WebElement maxinvestmenttextfield;
    @FindBy(xpath = "//button[contains(@id,'proceed-btn')]")
    private WebElement proceedbutton;
    @FindBy(xpath = "(//button[contains(@class,'px-3 btn btn-custom')])[2]")
    private WebElement letsstartbutton;
    @FindBy(xpath = "//h4[.='YES BANK']")
    private WebElement bankNameElement;
    @FindBy(css = "button.photon-button")
    private WebElement applyNowButton;
    @FindBy(xpath = "//div[@class='bank-header']")
    private List<WebElement> bankNameElements;
    @FindBy(xpath = "//button[.='Apply Now']") // Adjust the XPath to match the apply now buttons
    private List<WebElement> applyNowButtons;
    @FindBy(xpath = "//input[@name='pan-number']")
    private WebElement pannumbertextfield;
    @FindBy(xpath = "//input[contains(@name,'birth-date')]")
    private WebElement dobtextfield;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailtextfield;
    @FindBy(xpath = "//input[contains(@name,'phone')]")
    private WebElement phnotextfield;

    public HomePage(WebDriver rdriver) {
        this.ldriver = rdriver;
        PageFactory.initElements(ldriver, this);
    }

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

    public void enterAmount(String amount) {
        enteramounttextfield.sendKeys(amount);
    }

    public void enterLoanPeriod(String loanperiod) {
        loadnperiodtextfield.sendKeys(loanperiod);
    }

    public void clicOnNext() {
        nextbutton.click();
    }

    public void selectInvestmentType(String investmenttype) {
        if (investmenttype.equals("mutualfunds")) {
            mutualfunds.click();
        } else if (investmenttype.equals("shares")) {
            shares.click();
        } else {
            both.click();
        }
    }

    public void enterMinInvestment(String mininvestment) {
        mininvestmenttextfield.clear();
        mininvestmenttextfield.sendKeys(mininvestment);
    }

    public void enterMaxInvestment(String maxinvestment) {
        maxinvestmenttextfield.clear();
        maxinvestmenttextfield.sendKeys(maxinvestment);
    }

    public void clickOnproceed() {
        proceedbutton.click();
    }

    public void clickOnletsstart() {
        letsstartbutton.click();
    }

    public void selectBankAndApply(String bankname) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < bankNameElements.size(); i++) {
            String currentBankName = bankNameElements.get(i).getText();
            System.out.println(currentBankName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (currentBankName.equalsIgnoreCase(bankname)) {
                applyNowButtons.get(i).click();
                System.out.println("Clicked on Apply Now for " + bankname);
                return; // Exit the method after clicking the correct button
            }
        }
        System.out.println("Bank " + bankname + " not found.");
    }

    public void enterDetails(String pannumber, String dob, String email, String phno) {
        pannumbertextfield.sendKeys(pannumber);
        dobtextfield.sendKeys(dob);
        emailtextfield.sendKeys(email);
        phnotextfield.sendKeys(phno);
    }


}
