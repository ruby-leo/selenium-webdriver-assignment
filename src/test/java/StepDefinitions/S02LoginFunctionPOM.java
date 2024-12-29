package StepDefinitions;

import PageFactories.SauceDemoInventoryPage;
import PageFactories.SauceDemoLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class S02LoginFunctionPOM {
    private final SauceDemoLoginPage loginPage = new SauceDemoLoginPage(Hooks.driver);
    private final SauceDemoInventoryPage inventoryPage = new SauceDemoInventoryPage(Hooks.driver);
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
       Hooks.driver.get("https://www.saucedemo.com/");
    }
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }
    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
        Assert.assertTrue(inventoryPage.checkInventoryPageIsShown());
    }
    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String expectedErrMsg) {
        String actualErrMsg = loginPage.getErrorMsgTxt().trim();
        Assert.assertTrue(expectedErrMsg.trim().equalsIgnoreCase(actualErrMsg));
    }
}
