import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class SeleniumTest {

//  driver.get("https://www.wp.pl");

    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("firefox");
        driver.manage().window().maximize();
        Dimension windowSize = new Dimension(600, 800);
        driver.manage().window().setSize(windowSize);
        driver.get("https://google.pl");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://www.google.pl','blank','height=300,width=333')");
        WebDriver driver1 = getDriver("chrome");
        driver1.get("https://google.pl");
        driver.quit();  // zamyka wszystkie okna przegl¹darki
        driver1.quit();
        // driver.close(); // zamyka pierwotnie otwarte okno przegl¹darki
    }


    public WebDriver getDriver(String browser) {

        switch (browser) {
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                return new ChromeDriver();
            default:
                 throw new InvalidArgumentException("Invalid browser name");
        }
    }


    public WebDriver getDriverIf(String browser) {

        if (browser == "chrome") {
            return new ChromeDriver();
        } else if (browser == "firefox") {
            return new FirefoxDriver();
        } else {
            throw new InvalidArgumentException("Invalid browser name");
        }
    }
}


