package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Calendar;

public class LetCodeSignUpPage {
    WebDriver driver;
    public LetCodeSignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "name")
    WebElement nameTxtbox;
    @FindBy (id = "email")
    WebElement emailTxtbox;
    @FindBy (id = "pass")
    WebElement passTxtbox;
    @FindBy (id = "agree")
    WebElement terms_and_conditions_checkbox;
    @FindBy (xpath = "//button[@class='button is-primary']")
    WebElement signup_btn;
    @FindBy (className = "toast-message")
    WebElement toastMsg;

    public void enterName(String name){
        nameTxtbox.sendKeys(name);
    }
    public void enterEmail(String email){
        emailTxtbox.sendKeys(email);
    }
    public void enterPassword(String password){
        passTxtbox.sendKeys(password);
    }
    public void setTermsAndConditionsCheckbox(String value){
        if(value.equalsIgnoreCase("checked")){
            if(!terms_and_conditions_checkbox.isSelected())
                terms_and_conditions_checkbox.click();
        }else if(value.equalsIgnoreCase("unchecked")){
            if(terms_and_conditions_checkbox.isSelected())
                terms_and_conditions_checkbox.click();
        }
    }
    public void clickSignUp(){
        signup_btn.click();
    }
    public boolean checkErrorMessage(String expectedErrMsg){
        String actualErrMsg = toastMsg.getText().trim();
        return actualErrMsg.equalsIgnoreCase(expectedErrMsg);
    }
    public long getCurrentTimeInMilli(){
        Calendar date = Calendar.getInstance();
        return date.getTimeInMillis();
    }
}
