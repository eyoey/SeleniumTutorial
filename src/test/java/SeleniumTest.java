import org.openqa.selenium.InvalidArgumentException;
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
        driver.get("https://google.pl");
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


