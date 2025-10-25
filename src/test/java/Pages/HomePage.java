package Pages;

import Pages.DynamicLoading.DynamicLoadingPage;
import Pages.Form.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By formLinkBy = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator = By.linkText("Dropdown");
    By addRemoveLocator = By.linkText("Add/Remove Elements");
    By dynamicLoadingLocator = By.linkText("Dynamic Loading");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public FormPage goToFormPage(){
        driver.findElement(formLinkBy).click();
        return new FormPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxes(){
        driver.findElement(checkBoxLocator).click();
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




}
