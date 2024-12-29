package PageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasePage {
    WebDriver driver;
    Select selectObj;
    public SeleniumBasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="mySelect")
    WebElement selectDropdown;

    public void setDropdownOption(String option){
        selectObj = new Select(selectDropdown);
        selectObj.selectByContainsVisibleText(option);
    }
    public String getDropdownValue(){
        return selectObj.getFirstSelectedOption().getText();
    }
}
