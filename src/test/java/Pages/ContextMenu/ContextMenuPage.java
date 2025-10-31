package Pages.ContextMenu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenuPage {
    WebDriver driver;
    WebDriverWait wait;
    By contextBox = By.id("hot-spot");
    String expectedText = "You selected a context menu";
    Alert alert;
    Actions action;
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);
    }
    public void clickContextMenu(){
        WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(contextBox));
        action.contextClick(box).perform();
        alert = driver.switchTo().alert();
    }
    public String getAlertText(){
        return alert.getText();
    }
    public void acceptAlert(){
        alert.accept();
    }
    public String getExpectedText(){
        return expectedText;
    }


}
