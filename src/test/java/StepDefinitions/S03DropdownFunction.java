package StepDefinitions;

import PageFactories.SeleniumBasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03DropdownFunction {
    private int randomNum; // holds random value between 0 and 2 both inclusive
    private final String[] values = {"50", "75", "100"};
    private SeleniumBasePage basePage;

    @Given("I am on the Test page")
    public void i_am_on_the_test_page() {
        Hooks.driver.get().get("https://seleniumbase.io/demo_page");
    }
    @When("the value is set randomly")
    public void the_value_is_set_randomly() {
        randomNum = (int) (Math.random() * 3);
        basePage = new SeleniumBasePage(Hooks.driver.get());
        basePage.setDropdownOption(values[randomNum]);
    }
    @Then("the dropdown should have corresponding dropdown option")
    public void the_dropdown_should_have_corresponding_dropdown_option() {
        String actualResult = basePage.getDropdownValue();
    }
}
