package Pages;


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

    public AlertPage clickOnAlertsPage() {
        driver.findElement(alertsLocator).click();
        return new AlertPage(driver);
    }





}
