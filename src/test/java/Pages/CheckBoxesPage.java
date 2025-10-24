package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    WebDriver driver;

    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }
    By checkBoxOneLocator = By.xpath("//input[@type='checkbox'][1]");
    By checkBoxTwoLocator = By.xpath("//form/input[2]");


    public void clickOnCheckBoxOne(){
        driver.findElement(checkBoxOneLocator).click();
    }
    public void clickOnCheckBoxTwo(){
        driver.findElement(checkBoxTwoLocator).click();
    }

    public boolean checkboxOneIsSelected(){
        return driver.findElement(checkBoxOneLocator).isSelected();
    }
    public boolean checkboxTwoIsSelected(){
        return driver.findElement(checkBoxTwoLocator).isSelected();
    }

}
