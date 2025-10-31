package Pages;

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
    public final String expectedJsAlertText = "You successfully clicked an alert";
    public final String expectedJsConfirmText = "You clicked: Ok";
    public final String expectedJsDismissText = "You clicked: Cancel";
    public final  String expectedJsAlertMessage = "I am a JS Alert";



    public AlertPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public String getActualResult(){
        return driver.findElement(resultLocator).getText();
    }

    public String getExpectedJsAlertText(){
        return expectedJsAlertText;
    }

    public void clickOnJsConfirm(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(jsConfirmLocator))).click();
         alert = driver.switchTo().alert();
    }


    public void clickOnJsPrompt(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(jsPromptLocator))).click();
        alert = driver.switchTo().alert();

    }
    public void clickOnJsAlert(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(jsAlertLocator))).click();
         alert = driver.switchTo().alert();
    }

    public String getAlertMessage(){
        return alert.getText();
    }
    public void acceptAlert(){
        alert.accept();
    }

    public void sendKeysToAlert(String value){
        alert.sendKeys(value);
    }
    public void dismissAlert(){
        alert.dismiss();
    }



}
