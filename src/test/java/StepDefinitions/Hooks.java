package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;

public class Hooks {
    static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @Before
    public void setup(){
       driver.set(new ChromeDriver());
       driver.get().manage().window().maximize();
       driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @After
    public void teardown(Scenario scenario) throws IOException {
        String fileName = scenario.getName() + " "+ Utilities.generateCurrentDateTime() + ".jpg";
        byte[] screenshot = ((TakesScreenshot)driver.get()).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(fileName, new ByteArrayInputStream(screenshot));
        driver.get().quit();
    }
}
