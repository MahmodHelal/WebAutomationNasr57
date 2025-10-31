package Pages;

import Pages.Alerts.AlertPage;
import Pages.ContextMenu.ContextMenuPage;
import Pages.DragAndDrop.DragAndDropPage;
import Pages.DynamicLoading.DynamicLoadingPage;
import Pages.Form.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By formLinkBy = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator = By.linkText("Dropdown");
    By addRemoveLocator = By.linkText("Add/Remove Elements");
    By dynamicLoadingLocator = By.linkText("Dynamic Loading");
    By alertsLocator = By.linkText("JavaScript Alerts");
    By contextMenuLocator = By.linkText("Context Menu");
    By dragAndDropLocator = By.linkText("Drag and Drop");

    public HomePage(WebDriver driver){
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public FormPage goToFormPage(){
        wait.until(ExpectedConditions.elementToBeClickable(formLinkBy)).click();
        return new FormPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxes(){
         wait.until(ExpectedConditions.elementToBeClickable(checkBoxLocator)).click();
        return new CheckBoxesPage(driver);
    }
    public AddRemovePage clickOnAddRemovePage(){
        driver.findElement(addRemoveLocator).click();
        return new AddRemovePage(driver);
    }

    public DropdownPage clickOnDropdown(){
        driver.findElement(dropDownLocator).click();
        return new DropdownPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingPage(){
        driver.findElement(dynamicLoadingLocator).click();
        return new DynamicLoadingPage(driver);
    }
    public AlertPage clickOnAlertsPage(){
        driver.findElement(alertsLocator).click();
        return new AlertPage(driver);
    }

    public ContextMenuPage clickOnContextMenu(){
        driver.findElement(contextMenuLocator).click();
        return new ContextMenuPage(driver);
    }

    public DragAndDropPage clickOnDragAndDrop(){
        driver.findElement(dragAndDropLocator).click();
        return new DragAndDropPage(driver);
    }




}
