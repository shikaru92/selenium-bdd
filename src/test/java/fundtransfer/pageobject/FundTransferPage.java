package fundtransfer.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

/**
 * Created by tcbinh on 12/30/2015.
 */
public class FundTransferPage extends LoadableComponent<FundTransferPage>{

    public static final String url = "https://dl.dropboxusercontent.com/u/55228056/fundTransfer.html";
    public static final String title = "Online Fund Transfers";
    public WebDriver driver;


    @FindBy(id = "payee")
    public WebElement payeeField;

    @FindBy(id = "amount")
    public WebElement amountField;

    @FindBy(id = "transfer")
    public WebElement transferButton;

    @FindBy(id = "message")
    public WebElement messageLabel;

    public FundTransferPage()
    {
        Browser browser = new Browser();
        driver = browser.driver();
        PageFactory.initElements(browser.driver(), this);
    }

    @Override
    protected void load() {
        driver.get(url);
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(driver.getTitle().equals(title));
    }

    public void enterPayeeName(String payeeName)
    {
        payeeField.sendKeys(payeeName);
    }

    public void enterAmount(String amount)
    {
        amountField.sendKeys(amount);
    }

    public void clickTransferButton()
    {
        transferButton.click();
    }

    public String getMessage()
    {
        return messageLabel.getText();
    }

    public void closeBrowser()
    {
        driver.close();
    }
}
