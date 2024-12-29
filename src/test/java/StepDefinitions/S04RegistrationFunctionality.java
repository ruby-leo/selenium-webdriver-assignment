package StepDefinitions;

import PageFactories.LetCodeHomePage;
import PageFactories.LetCodeSignUpPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class S04RegistrationFunctionality {
    LetCodeHomePage homePage;
    LetCodeSignUpPage signUpPage;
    @Given("I am on the registration page")
    public void openSignUpPage() {
        Hooks.driver.get("https://letcode.in/");
        homePage = new LetCodeHomePage(Hooks.driver);
        homePage.clickSignUp();
        signUpPage = new LetCodeSignUpPage(Hooks.driver);
    }
    @When("I enter a valid email")
    public void enterValidEmail() {
        signUpPage.enterEmail("validEmail" + signUpPage.getCurrentTimeInMilli() + "@gmail.com");
    }
    @And("I enter a valid password")
    public void enterValidPassword() {
        signUpPage.enterPassword("Valid123!");
    }
    @And("I check the Terms and Conditions checkbox")
    public void iCheckTheTermsAndConditionsCheckbox() {
        signUpPage.setTermsAndConditionsCheckbox("checked");
    }
    @And("I click the Sign Up button")
    public void clickSignup() {
        signUpPage.clickSignUp();
    }
    @Then("I should be redirected to the home page")
    public void shouldBeRedirectedToHomePage() {
        Assert.assertTrue(homePage.presenceOfSignOutBtn());
    }
    @When("I enter email {string}")
    public void i_enter_email(String string) {
        signUpPage.enterEmail(string.replace("@gmail.com",signUpPage.getCurrentTimeInMilli() + "@gmail.com" ));
    }
    @And("I enter password {string}")
    public void enterPassword(String string){
        signUpPage.enterPassword(string);
    }
    @And("set terms and conditions {string}")
    public void setTermsAndConditionsStatus(String string){
        signUpPage.setTermsAndConditionsCheckbox(string);
    }
    @Then("I should see error message {string}")
    public void shouldSeeErrorMessage(String string) {
        boolean isCorrectErrorDisplayed = signUpPage.checkErrorMessage(string);
        Assert.assertTrue(isCorrectErrorDisplayed);
    }
}
