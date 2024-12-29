package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LetCodeHomePage {
    WebDriver driver;
    WebDriverWait wait;
    public LetCodeHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign up")
    WebElement signup_link;
    @FindBy(linkText = "Sign out")
    WebElement signout_link;

    public void clickSignUp(){
        signup_link.click();
    }
    public boolean presenceOfSignOutBtn(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(signout_link));
        return signout_link.isDisplayed();
    }
}
