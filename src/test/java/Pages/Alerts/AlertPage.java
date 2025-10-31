package Pages.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;
    By jsAlertLocator = By.cssSelector("button[onclick='jsAlert()']");
    By jsConfirmLocator = By.cssSelector("button[onclick='jsConfirm()']");
    By jsPromptLocator = By.cssSelector("button[onclick='jsPrompt()']");
    By resultLocator = By.id("result");
    String expectedText = "I am a JS Alert";
    String expectedTextConfirm = "I am a JS Confirm";
    String expectedTextPrompt = "I am a JS prompt";
    String ExpectedResultJSAlert = "You successfully clicked an alert";
    String ExpectedResultJSConfirm = "You clicked: Cancel";



    public String getExpectedResultJSAlert() {
        return ExpectedResultJSAlert;
    }

    public String getExpectedResultJSConfirm() {
        return ExpectedResultJSConfirm;
    }

    public AlertPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickJsAlert(){
        wait.until(ExpectedConditions.elementToBeClickable(jsAlertLocator)).click();
        alert = driver.switchTo().alert();

    }
    public void clickJsConfirm(){
        wait.until(ExpectedConditions.elementToBeClickable(jsConfirmLocator)).click();
        alert = driver.switchTo().alert();

    }
    public void clickJsPrompt(){
        wait.until(ExpectedConditions.elementToBeClickable(jsPromptLocator)).click();
        alert = driver.switchTo().alert();

    }

    public void acceptAlert(){
        alert.accept();
    }
    public void dismissAlert(){
        alert.dismiss();
    }
    public void sendKeysAlert(String text){
        alert.sendKeys(text);
    }
    public String getResultText(){
        return driver.findElement(resultLocator).getText();
    }

    public String getAlertText(){
        return alert.getText();
    }


    public String getExpectedText() {
        return expectedText;
    }

    public String getExpectedTextConfirm() {
        return expectedTextConfirm;
    }

    public String getExpectedTextPrompt() {
        return expectedTextPrompt;
    }
}
