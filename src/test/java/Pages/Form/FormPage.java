package Pages.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormPage {
    WebDriver driver;
WebDriverWait wait;
public FormPage(WebDriver driver){
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));

}
    By userNameBy = By.id("username");
    By passwordBy = By.id("password");
    By loginButtonBy = By.xpath("//button[@class=\"radius\"]");
    By actualFailedMessageBy = By.id("flash");
    String expectedFailureMessageTextForUserName = "Your username is invalid!";
    String expectedFailureMessageTextForPassword = "Your password is invalid!";

    public void  enterUsername(String username){
        driver.findElement(userNameBy).sendKeys(username);
    }
    public void  enterPassword(String password){
        driver.findElement(passwordBy).sendKeys(password);
    }
    public SecureArea clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButtonBy)).click();
        return new SecureArea(driver);
    }

    private String getActualFailedMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(actualFailedMessageBy)).getText();
    }

    public boolean isLoginFailedCaseUsername(){
        return getActualFailedMessage().contains(expectedFailureMessageTextForUserName);

    }

    public boolean isLoginFailedCasePassword(){
        return getActualFailedMessage().contains(expectedFailureMessageTextForPassword);

    }


}
