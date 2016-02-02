package fundtransfer.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fundtransfer.pageobject.FundTransferPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by tcbinh on 12/29/2015.
 */
public class FundTransferStepDefs {
    FundTransferPage fundTransferPage;
    @Before
    public void setUp() {
        fundTransferPage = new FundTransferPage();
    }

    @Given("the user is on Fund Transfer Page")
    public void The_user_is_on_fund_transfer_page() {
        fundTransferPage.get();
    }

    @When("he enters \"([^\"]*)\" as payee name")
    public void He_enter_payee_name(String payeee) {
        fundTransferPage.enterPayeeName(payeee);
    }

    @When("he enters \"([^\"]*)\" as amount")
    public void He_enters_amount(String amount) {
        fundTransferPage.enterAmount(amount);
    }

    @And("he Submits request for Fund Transfer")
    public void He_submits_request_for_fund_transfer() {
        fundTransferPage.clickTransferButton();
    }

    @Then("ensure the fund transfer is complete with \"([^\"]*)\" message")
    public void Ensure_the_fund_transfer_is_complete(String msg) {
        Assert.assertEquals(fundTransferPage.getMessage(), msg);
    }

    @Then("ensure a transaction failure message \"([^\"]*)\" is displayed")
    public void Ensure_a_transaction_failure_message(String msg) {
        Assert.assertEquals(fundTransferPage.getMessage(), msg);
    }

    @After
    public void teardown()
    {
        fundTransferPage.closeBrowser();
    }
}
