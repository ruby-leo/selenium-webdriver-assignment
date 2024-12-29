package StepDefinitions;

import PageFactories.GoogleHomePage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.io.IOException;

public class S01ClickLink {
    @Given("User has opened {string}")
    public void openURL(String url) {
        Hooks.driver.get().get(url);
    }
    @And("user has clicked About link")
    public void clickAbout() {
        GoogleHomePage ghp = new GoogleHomePage(Hooks.driver.get());
        ghp.clickAboutLink();
    }
    @Then("About page should be displayed")
    public void checkAboutPageVisibility(){
        String currentURL = Hooks.driver.get().getCurrentUrl();
        Assert.assertTrue(currentURL != null && currentURL.contains("https://about.google"));
    }
}