package Pages.DragAndDrop;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DragAndDropPage {
     WebDriver driver;
     WebDriverWait wait;
     Actions actions;

    // Locators
     By columnALocator = By.id("column-a");
     By columnBLocator = By.id("column-b");
     By headerALocator = By.cssSelector("#column-a header");
     By headerBLocator = By.cssSelector("#column-b header");

     public DragAndDropPage(WebDriver driver){
         this.driver = driver;
         this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         this.actions = new Actions(driver);
     }
     public void dragAtoB(){
         WebElement columnA = driver.findElement(columnALocator);
         WebElement columnB = driver.findElement(columnBLocator);
//         actions.clickAndHold(columnA).moveToElement(columnB).release().build().perform();
     actions.dragAndDrop(columnA,columnB).build().perform();
     }
     public void dragBtoA(){
         WebElement columnA = driver.findElement(columnALocator);
         WebElement columnB = driver.findElement(columnBLocator);
         actions.clickAndHold(columnB).perform();
         actions.moveToElement(columnA).perform();
         actions.release().perform();
     }
     public String getFirstHeader(){
         return driver.findElement(headerALocator).getText();
     }
     public String getSecondHeader(){
         return driver.findElement(headerBLocator).getText();
     }


}

