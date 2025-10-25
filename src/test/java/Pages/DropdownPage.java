package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    By dropDownLocator = By.id("dropdown");


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectByText(String option){
        Select select = new Select(driver.findElement(dropDownLocator));
        select.selectByVisibleText(option);
    }

    public void selectByIndex(int index){
        Select select = new Select(driver.findElement(dropDownLocator));
        select.selectByIndex(index);
    }
public void selectByValue(String value){
    Select select = new Select(driver.findElement(dropDownLocator));
    select.selectByValue(value);
}
}
