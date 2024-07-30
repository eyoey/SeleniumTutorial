import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

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
        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator); // zwróci tylko pierwszy element
        input.sendKeys("wartoœæ testowa"); // uzupe³nia ten pierwszy znaleziony input
        List<WebElement> inputs = driver.findElements(inputLocator); // zwróci listê elementów
        System.out.println(inputs.size());

        // lokalizowanie po treœci linka
        By linkText = By.linkText("Visit W3Schools.com!");  // znajduje po ca³oœci tekstu
        WebElement schoolLink = driver.findElement(linkText);

        By partialText = By.partialLinkText("W3Schools");  // znajduje po fragmencie tekstu (równie¿ mo¿na zwróciæ w formie listy elementy z danym fragmentem)
        WebElement partialLink = driver.findElement(partialText);

    }

}