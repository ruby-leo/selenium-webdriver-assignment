package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoInventoryPage {
    WebDriver driver;
    public SauceDemoInventoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy (className = "shopping_cart_link")
    WebElement shoppingCartIcon;

    public boolean checkInventoryPageIsShown(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartIcon));
        return shoppingCartIcon.isDisplayed();
    }
}
