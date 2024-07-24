import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorTest {


    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        // lokalizowanie po atrybucie ID
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
       // clickOnMeButton.click();

        // lokalizowanie po atrybucie name
        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);
        // lub mo¿na bezpoœrednio siê odwo³aæ:
        driver.findElement(By.name("fname"));

        // lokalizowanie po atrybucie class
        By paraHidden = By.className("topSecret");
        driver.findElement(paraHidden);

        // lokalizowanie po tagu (tagu html)





    }

}