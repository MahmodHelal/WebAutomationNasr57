package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    By formLinkBy = By.linkText("Form Authentication");
    By checkBoxLocator = By.linkText("Checkboxes");
    By dropDownLocator = By.linkText("Dropdown");

    By addRemoveLocator = By.linkText("Add/Remove Elements");


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



}
