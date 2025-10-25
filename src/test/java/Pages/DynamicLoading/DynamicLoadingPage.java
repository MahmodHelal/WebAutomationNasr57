package Pages.DynamicLoading;

import Pages.DynamicLoading.Examples.Ex1;
import Pages.DynamicLoading.Examples.Ex2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;

    By exampleOneLocator = By.linkText("Example 1: Element on page that is hidden");
    By exampleTwoLocator = By.partialLinkText("Example 2:");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }


    public Ex1 clickOnExample1Link(){
        driver.findElement(exampleOneLocator).click();
        return new Ex1(driver);
    }

/*    public Ex2 clickOnExample2Link(){
        driver.findElement(exampleTwoLocator).click();
        return new Ex2(driver);
    }*/
}
