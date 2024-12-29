package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilities {
    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile, new File("target/screenshots/" + fileName));
    }
    public static String generateCurrentDateTime(){
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("ddMMMyyyy-HH:mm:ss:SSS"));
    }
}
