import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    @Test
    public void OpenGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.switchTo().frame(0);// change activity to cookie popup
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(),'Zaakceptuj')]"));
        agreeButton.click();

        driver.switchTo().defaultContent();   // activity back to primary window
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//span"));


        Assert.assertTrue(result.isDisplayed());

    }



    public WebDriver getDriver(String browser) {

        return switch (browser) {
            case "firefox" -> new FirefoxDriver();
            case "chrome" -> new ChromeDriver();
            default -> throw new InvalidArgumentException("Invalid browser name");
        };
    }
}
