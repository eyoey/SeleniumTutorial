import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        // je¿eli szukamy element z id to u¿ywamy # (hasza)
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        // je¿eli szukamy element z class to u¿ywamy . (kropki)
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        // je¿eli szukamy po tagu, wystarczy podaæ nazwê tagu
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("wartoœæ testowa");

        // je¿eli szukamy po atrybucie np. name, href, to:
        By cssName = By.cssSelector("[name='fname']");  // name - w tym wypadku nazwa atrybutu, mo¿e te¿ byæ class
        driver.findElement(cssName);

        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);


    }
}
