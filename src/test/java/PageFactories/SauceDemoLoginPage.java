package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {
    WebDriver driver;
    public SauceDemoLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameTxtbox;
    @FindBy(id = "password")
    WebElement passwordTxtbox;
    @FindBy(id = "login-button")
    WebElement loginBtn;
    @FindBy(tagName = "h3")
    WebElement errMsgTxt;

    public void enterUsername(String username){
        usernameTxtbox.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordTxtbox.sendKeys(password);
    }
    public void clickLogin(){
        loginBtn.click();
    }
    public String getErrorMsgTxt(){
        return errMsgTxt.getText();
    }
}
